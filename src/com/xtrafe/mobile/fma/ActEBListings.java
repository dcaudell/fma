package com.xtrafe.mobile.fma;

import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xtrafe.fma.shared.SharedEbayIdList;
import com.xtrafe.fma.shared.SharedEbayIdSortType;
import com.xtrafe.fma.shared.SharedEbayItem;
import com.xtrafe.fma.shared.SharedStrings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class ActEBListings extends ActBase {

	private List<String> ids;
	private SharedEbayIdSortType sortOrder = SharedEbayIdSortType.NONE;
	private EditText searchText;
	private ListView listView;
	private LazyListAdapter listAdapter;
	private SeekBar seekBar;
	
	
	private void getIds() {
		if (ids != null)
			return;
		
		ids = new ArrayList<String>();
		if ((searchText.getText() == null) ||
		    (searchText.getText().toString().trim().equals("")))
		    return;			
		
		try {
			String url = SharedStrings.addrEbay;
			String searchOrder = SharedStrings.parmOrder + "=" + sortOrder.name();		
			String encoded = URLEncoder.encode(searchText.getText().toString(), "UTF-8");
			String searchString = SharedStrings.parmSearch + "=" + encoded;			
			String request = url + "?" + searchString + "&" + searchOrder;
			SharedEbayIdList sharedIdList =  TSRemote.getRemoteObject(new URI(request), null, SharedEbayIdList.class);
			if (sharedIdList != null)
				ids.addAll(sharedIdList.getItems());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		logI("Found " + ids.size() + " listings.");	
	}

	private void init() {
		listView = (ListView) findViewById(R.id.eblistingsListView);		
		seekBar = (SeekBar) findViewById(R.id.eblistingsSeekBar);
		searchText = (EditText) findViewById(R.id.eblistingsSearch);
		
		final ImageButton searchButton = (ImageButton) findViewById(R.id.eblistingsButtonSearch);		
		
		searchText.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				searchText.selectAll();
			}
		});
						
		searchText.setOnEditorActionListener(new TextView.OnEditorActionListener() {			
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				ids = null;
				populate();
				return true;
			}
		});
		
		
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				SharedEbayItem item = (SharedEbayItem) listAdapter.getItem(position);
				if (item != null){
					Uri uri = Uri.parse(item.getItemURL());
					Intent intent = new Intent(Intent.ACTION_VIEW, uri);
					startActivity(intent);
				}
			}
		});		
		
		listView.setOnScrollListener(new AbsListView.OnScrollListener() {			
			
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				//Do nothing.
			}
			
			public void onScroll(AbsListView view, int firstVisibleItem,
					int visibleItemCount, int totalItemCount) {
				seekBar.setProgress(firstVisibleItem);
			}
		});
		
		seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar seekBar) {
				listView.setSelection(seekBar.getProgress());
			}
			
			public void onStartTrackingTouch(SeekBar seekBar) {
				//Do nothing.
			}
			
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				//Do nothing
			}
		});
				
		searchButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				ids = null;
				populate();
			}
		});			
	}
	
	public void onConfigurationChanged(Configuration newConfig){
		super.onConfigurationChanged(newConfig);		
		setContentView(R.layout.eblistings);
		init();
		populate();
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eblistings);        
		init();
		restore();    	    	       
		logI("Born.");        
	}

	private void persist() {
		/*SharedPreferences sp = getSharedPreferences("MyTag", Context.MODE_PRIVATE);
    	Editor editor = sp.edit();
    	//Store state variables
    	editor.commit();*/
	}

	private void populate() {
		new PopulateTask().execute();
		persist();
	}

	private void restore() {    	
		/*SharedPreferences sp = getSharedPreferences("MyTag", Context.MODE_PRIVATE);*/    	
		//Restore state variables    	    		
		populate();    	
	}

	private class LazyListAdapter 
	extends BaseAdapter
	implements ListAdapter {					

		private final int maxCacheSize = 30;
		private HashMap<String, View> viewCache = new HashMap<String, View>();
		private HashMap<String, SharedEbayItem> itemCache = new HashMap<String, SharedEbayItem>();
		
		public int getCount() {
			return ids.size();
		}

		public Object getItem(int position) {
			return itemCache.get(ids.get(position));
		}

		public long getItemId(int position) {
			return 0;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			return getViewForEbayID(ids.get(position));
		}

		private View getViewForEbayID(final String id){
			if (viewCache.containsKey(id))
				return viewCache.get(id);
			
			if (viewCache.size() > maxCacheSize)
				viewCache.remove(viewCache.keySet().iterator().next());
							
			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View view = inflater.inflate(R.layout.eblistingsmenuitem, null);
						
			try {					
				final TextView textTitle = (TextView) view.findViewById(R.id.eblistingsmenuitemTitle);
				final TextView textEnds = (TextView) view.findViewById(R.id.eblistingsmenuitemEnds);
				final TextView textPrice = (TextView) view.findViewById(R.id.eblistingsmenuitemPrice);
				final TextView textBids = (TextView) view.findViewById(R.id.eblistingsmenuitemBids);	
				
				final String request = SharedStrings.addrEbay + "?" + SharedStrings.parmItem + "=" + id;
				
				/*
				//Synchronous Way
				SharedEbayItem item =  TSRemote.getRemoteObject(new URI(request), null, SharedEbayItem.class);				
				if (item != null){
					itemCache.put(id, item);
					logI("Got item " + item.getTitle());
				}
				if (item.getTitle() != null)
					textTitle.setText(item.getTitle());							
				if (item.getEndTime() != null)
					textEnds.setText(getResources().getString(R.string.labelEnds) + " " + item.getEndTime().toString());							
				String bidString = (item.getBidCount() == 1) ? 
						getResources().getString(R.string.labelBid) :
					    getResources().getString(R.string.labelBids);
				textBids.setText(String.valueOf(item.getBidCount()) + " " + bidString);
				if (item.getCurrentPrice() != null)
					textPrice.setText("$" + item.getCurrentPrice());*/										
				
				
				//Asynchronous Way
				new LoadingTask(ActEBListings.this) {
					SharedEbayItem item;
					
					public void onConstruct() {
						showDialog = false;
					}
					
					public void run() {
						try {
							item =  TSRemote.getRemoteObject(new URI(request), null, SharedEbayItem.class);													
							if (item != null)
								itemCache.put(id, item);
						}
						catch (Exception e){
							e.printStackTrace();
						}
					}
					
					public void post() {
						if (item != null) {
							if (item.getTitle() != null)
								textTitle.setText(item.getTitle());							
							if (item.getEndTime() != null)
								textEnds.setText(getResources().getString(R.string.labelEnds) + " " + item.getEndTime().toString());							
							String bidString = (item.getBidCount() == 1) ? 
									getResources().getString(R.string.labelBid) :
								    getResources().getString(R.string.labelBids);
							textBids.setText(String.valueOf(item.getBidCount()) + " " + bidString);
							if (item.getCurrentPrice() != null)
								textPrice.setText("$" + item.getCurrentPrice());													
						}
					}
				}.execute();
				
				viewCache.put(id, view);				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return view;
		}			
	}

	private class PopulateTask extends LoadingTask {

		private PopulateTask(){
			super(ActEBListings.this);
		}

		public void run() {			
			getIds();
		}

		public void post() {
			listAdapter = new LazyListAdapter();
			ListView listView = (ListView) findViewById(R.id.eblistingsListView);
			listView.setAdapter(listAdapter);
			seekBar.setMax(listAdapter.getCount() - 1);
		}
	}
}
