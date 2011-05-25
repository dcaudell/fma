package com.xtrafe.mobile.fma;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xtrafe.fma.shared.SharedStock;
import com.xtrafe.fma.shared.SharedStockDetail;
import com.xtrafe.fma.shared.SharedStockList;
import com.xtrafe.fma.shared.SharedStrings;
import com.xtrafe.fma.shared.SharedSymbolFilterType;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class ActTSStockChooser
	extends ActBase
{	
	private static final int DIALOG_STOCKDETAIL = 0;
	
	private SeekBar seekBar;
	private ListView listView;
	private LazyListAdapter listAdapter;
	private Map<String, SharedStock> sharedStocks;	
	private SharedSymbolFilterType filterType = SharedSymbolFilterType.NONE;
	private String filterString;
	private String selectedSymbol;
	
	private void doFilter() {
		EditText filterText = (EditText) findViewById(R.id.tsstockchooserFilter);
		filterString = filterText.getText().toString();
		if ((filterString != null) &&
			!(filterString.trim().equals("")))
			filterType = SharedSymbolFilterType.BOTH;
		else
			filterType = SharedSymbolFilterType.NONE;
		populate();
	}
	
	private void getSharedStocks(){
		sharedStocks = new HashMap<String, SharedStock>();		
		try {											
			SharedStockList sharedStockList =  TSRemote.getRemoteObject(new URI(SharedStrings.addrStocks), null, SharedStockList.class);			
			for (SharedStock sharedStock : sharedStockList)
				sharedStocks.put(sharedStock.getSymbol(), sharedStock);			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		logI("Found " + sharedStocks.size() + " symbols.");		
	}
	
	private void init() {
		listView = (ListView) findViewById(R.id.tsstockchooserListView);		
		seekBar = (SeekBar) findViewById(R.id.tsstockchooserSeekBar);
		final ImageButton filterButton = (ImageButton) findViewById(R.id.tsstockchooserButtonFilter);
		final ImageButton refreshButton = (ImageButton) findViewById(R.id.tsstockchooserButtonRefresh);
		final EditText filterText = (EditText) findViewById(R.id.tsstockchooserFilter);
		
		filterText.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				filterText.selectAll();
			}
		});
						
		filterText.setOnEditorActionListener(new TextView.OnEditorActionListener() {			
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				doFilter();
				return true;
			}
		});
		
		
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				selectedSymbol = ((SharedStock) listAdapter.getItem(position)).getSymbol();
				showDialog(DIALOG_STOCKDETAIL);
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
				
		filterButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				doFilter();
			}
		});
		
		refreshButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				sharedStocks = null;
				populate();
			}
		});
	}
	
	private void populate() {
		new PopulateTask().execute();
		persist();
	}
	
	public void onConfigurationChanged(Configuration newConfig){
		super.onConfigurationChanged(newConfig);		
		setContentView(R.layout.tsstockchooser);
		init();
		populate();
	}
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tsstockchooser);        
    	init();
    	restore();    	    	       
        logI("Born.");        
    }
	
	protected Dialog onCreateDialog(int id){
		switch (id) {
			case DIALOG_STOCKDETAIL:
				return new StockDetailDialog(this);
			default:
				return null;
		}
	}
	
	private void persist() {
		//Write preferences object
	}
	
	private void restore() {
		//Get state
		populate();
	}
	
	private class LazyListAdapter 
		extends BaseAdapter
		implements ListAdapter {

		List<SharedStock> filteredSharedStocks = new ArrayList<SharedStock>();		
		
		public LazyListAdapter(){
			if (filterType == null)
				filterType = SharedSymbolFilterType.NONE;
			
			switch (filterType) {
				case BOTH:
					for (SharedStock sharedStock : sharedStocks.values())						
						if ((sharedStock.getSymbol().toUpperCase().contains(filterString.toUpperCase()) ||
						    (sharedStock.getName().toUpperCase().contains(filterString.toUpperCase()))))
						    filteredSharedStocks.add(sharedStock);						
					break;
				default:
					filteredSharedStocks.addAll(sharedStocks.values());	
			}					
			
			Collections.sort(filteredSharedStocks, new Comparator<SharedStock>() {
				public int compare(SharedStock object1, SharedStock object2) {
					return object1.getSymbol().compareTo(object2.getSymbol());					
				}
			});			
		}			
		
		public int getCount() {
			return filteredSharedStocks.size();
		}

		public Object getItem(int position) {
			return filteredSharedStocks.get(position);
		}

		public long getItemId(int position) {
			return 0;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			return getViewForSymbol(filteredSharedStocks.get(position).getSymbol());
		}
		
		private View getViewForSymbol(String symbol){
			try {
				
				LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View view = inflater.inflate(R.layout.tsstockchoosermenuitem, null);										
				SharedStock stock = sharedStocks.get(symbol);
				if (stock != null){
					TextView companyNameText = (TextView) view.findViewById(R.id.tsstockchoosermenuitemCompany);
					companyNameText.setText(stock.getName());
					TextView symbolText = (TextView) view.findViewById(R.id.tsstockchoosermenuitemSymbol);
					symbolText.setText(stock.getSymbol());
					TextView priceText = (TextView) view.findViewById(R.id.tsstockchoosermenuitemPrice);
					priceText.setText(String.valueOf(stock.getPrevious()));
					TextView changeText = (TextView) view.findViewById(R.id.tsstockchoosermenuitemChange);
					changeText.setText(stock.getPercentageChange());
					if (stock.getPercentageChange().contains("+"))
						changeText.setTextColor(getResources().getColor(R.color.colorGreen));
					else if (stock.getPercentageChange().contains("-"))
						changeText.setTextColor(getResources().getColor(R.color.colorRed));
				}									
				return view;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
		}			
	}
	
	private class PopulateTask extends LoadingTask {
		
		private PopulateTask(){
			super(ActTSStockChooser.this);
		}
		
		public void run() {
			if (sharedStocks == null)
				getSharedStocks();
		}
		
		public void post() {
			listAdapter = new LazyListAdapter();
			ListView listView = (ListView) findViewById(R.id.tsstockchooserListView);
			listView.setAdapter(listAdapter);
			seekBar.setMax(listAdapter.getCount() - 1);
		}
	}	
	
	private class StockDetailDialog extends Dialog {
		
		LinearLayout layout;
		
		TextView textCompanyName;
		TextView textSymbol;
		TextView textTime;
		TextView textPreviousClose;
		TextView textDayOpen;
		TextView textCurrent;
		TextView textPercentageChange;
		TextView textHigh;
		TextView textLow;
		TextView textVolume;
		TextView textAnnualRange;
		TextView textPERatio;
		TextView textEarns;
		TextView textMarketCap;
		
		private SharedStockDetail stock;
		
		public StockDetailDialog(Context context){
			super(context);			
		}
		
		private void init() {
			textCompanyName = (TextView) findViewById(R.id.tsstockdetailCompanyName);
			textSymbol = (TextView) findViewById(R.id.tsstockdetailSymbol);
			textTime = (TextView) findViewById(R.id.tsstockdetailTime);
			textPreviousClose = (TextView) findViewById(R.id.tsstockdetailPreviousClose);
			textDayOpen = (TextView) findViewById(R.id.tsstockdetailDayOpen);
			textCurrent = (TextView) findViewById(R.id.tsstockdetailCurrent);
			textPercentageChange = (TextView) findViewById(R.id.tsstockdetailPercentageChange);
			textHigh = (TextView) findViewById(R.id.tsstockdetailHigh);
			textLow = (TextView) findViewById(R.id.tsstockdetailLow);
			textVolume = (TextView) findViewById(R.id.tsstockdetailVolume);
			textAnnualRange = (TextView) findViewById(R.id.tsstockdetailAnnualRange);
			textPERatio = (TextView) findViewById(R.id.tsstockdetailPERatio);
			textEarns = (TextView) findViewById(R.id.tsstockdetailEarns);
			textMarketCap = (TextView) findViewById(R.id.tsstockdetailMarketCap);
			
			layout = (LinearLayout) findViewById(R.id.tsstockdetailLayout);			
			layout.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					dismiss();				
				}
			});	
			
			this.setOnShowListener(new DialogInterface.OnShowListener() {				
				public void onShow(DialogInterface dialog) {
					populate();
				}
			});
		}
		
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			getWindow().requestFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.tsstockdetail);
			LayoutParams params = getWindow().getAttributes(); 
            params.height = LayoutParams.FILL_PARENT;
            params.width = LayoutParams.FILL_PARENT;
            getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);             
			init();
		}
		
		private void populate() {
			new PopulateTask().execute();
		}
		
		private class PopulateTask extends LoadingTask {

			public PopulateTask() {
				super(ActTSStockChooser.this);
			}
			
			public void run() {
				try {
					String address = SharedStrings.addrStocks + "?" + SharedStrings.parmSymbol + "=" + selectedSymbol;				
					stock =  TSRemote.getRemoteObject(new URI(address), null, SharedStockDetail.class);
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
			
			public void post() {
				
				//setTitle(stock.getName());				
				textCompanyName.setText(stock.getName());
				textSymbol.setText(stock.getSymbol());
				Calendar calendar = stock.getTickDayDate();				
				if (calendar != null) {
					Calendar tickTime = stock.getTickTime();
					if (tickTime != null) {						
						calendar.set(Calendar.HOUR_OF_DAY, tickTime.get(Calendar.HOUR_OF_DAY));
						calendar.set(Calendar.MINUTE, tickTime.get(Calendar.MINUTE));
						calendar.set(Calendar.SECOND, tickTime.get(Calendar.SECOND));
						Date whatAMess = calendar.getTime();
						textTime.setText(new SimpleDateFormat(getResources().getString(R.string.labelDateFormat)).format(whatAMess));
					}					
				}
				
				textPreviousClose.setText(String.valueOf(stock.getPreviousClose()));
				textDayOpen.setText(String.valueOf(stock.getDayOpen()));
				textCurrent.setText(String.valueOf(stock.getPrevious()));
				textPercentageChange.setText(stock.getPercentageChange());
				textHigh.setText(String.valueOf(stock.getHigh()));
				textLow.setText(String.valueOf(stock.getLow()));
				textVolume.setText(String.valueOf(stock.getVolume()));
				textAnnualRange.setText(stock.getAnnRange());
				textPERatio.setText(String.valueOf(stock.getPeRatio()));
				textEarns.setText(String.valueOf(stock.getEarns()));
				textMarketCap.setText(stock.getMktCap());						
			}
		}		
	}
}
