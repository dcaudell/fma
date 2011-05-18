package com.xtrafe.mobile.fma;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ActNDFDeckChooser extends ActBase {
	
	static final int DIALOG_NEWDECK = 0;
	static final int DIALOG_DELDECK = 1;

	private ArrayList<String> fileNames;
	private ListView listView;
	private View selectedView;
	private ViewListAdapter viewListAdapter;
	private String lastQuizDeck;
	private int selectedDeck;	
	
		
	private void addDeck(String filename){
		NDFDeck deck = NDFPersistent.load(filename, this, NDFDeck.class);
		if (deck == null)
			return;
				
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.ndfdeckchoosermenuitem, null);
		TextView deckName = (TextView) view.findViewById(R.id.ndfdeckchoosermenuitemDeckName);
		deckName.setText(deck.getName());		
				
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(deck.getLastModified());
		TextView lastModified = (TextView) view.findViewById(R.id.ndfdeckchoosermenuitemLastModified);
		Date date = new Date(deck.getLastModified());		
		lastModified.setText(new SimpleDateFormat(getResources().getString(R.string.labelDateFormat)).format(date));
		fileNames.add(filename);
		viewListAdapter.add(view);
	}
	
	private void deleteDeck() {		
		String filename = fileNames.get(selectedDeck);
		if (filename.equals(lastQuizDeck))
			lastQuizDeck = null;
		selectedDeck = -1;
		
		logI("Trying to delete: " + filename);
		File dir = getFilesDir();
		File toDelete = new File(dir, filename);
		if (toDelete.exists())
			toDelete.delete();		
		persist();
		populate();
	}
	
	private void editDeck() {
		String filename = fileNames.get(selectedDeck);
		Bundle bundle = new Bundle();
		bundle.putString(getResources().getString(R.string.tagDeckFilename), filename);		
		Intent intent = new Intent(this, ActNDFDeckEditor.class);
		intent.putExtras(bundle);
		startActivity(intent);
	}
	
	private Dialog getDialogDelDeck(){
		return getAlertDialog(getResources().getString(R.string.titleDeleteDeck), new DialogInterface.OnClickListener() {			
			public void onClick(DialogInterface dialog, int which) {
				deleteDeck();				
			}
		});
	}
	
	private void init() {
		Button buttonDelDeck = (Button) findViewById(R.id.ndfdeckchooserButtonDelete);
		buttonDelDeck.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				showDialog(DIALOG_DELDECK);				
			}
		});
		
		Button buttonEditDeck = (Button) findViewById(R.id.ndfdeckchooserButtonEdit);
		buttonEditDeck.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				editDeck();			
			}
		});
		
		Button buttonNewDeck = (Button) findViewById(R.id.ndfdeckchooserButtonNew);
		buttonNewDeck.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				showDialog(DIALOG_NEWDECK);
			}
		});			
				
		listView = (ListView) findViewById(R.id.ndfdeckchooserListView);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
				listView.setSelection(pos);								
				logI("onItemClicky. pos = " + pos + " name = " + fileNames.get(pos));
				if (selectedView != null)
					selectedView.setBackgroundColor(getResources().getColor(R.color.colorBlack));
				selectedView = view;
				view.setBackgroundColor(getResources().getColor(R.color.colorDeckSelected));
				selectedDeck = pos;
				updateButtonState();
				persist();
			}
		});
				
		/* Possibly breaking the paradigm here...
		 * http://android-developers.blogspot.com/2008/12/touch-mode.html
		 * 		 
		listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {				
				selectedDeck = pos;
				updateButtonState();
				persist();
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				selectedDeck = -1;
				updateButtonState();
				persist();
			}		
		});*/		
	}    
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ndfdeckchooser);        
    	init();
    	restore();    	    	       
        logI("Born,");
    }
	
	protected Dialog onCreateDialog(int id){
		switch (id) {
			case DIALOG_NEWDECK:
				return new NewDeckModal(this);
			case DIALOG_DELDECK:
				return getDialogDelDeck();
			default:
				return null;
		}
	}
	
	public void populate() {
		selectedDeck = -1;
		selectedView = null;
		fileNames = new ArrayList<String>();
		viewListAdapter = new ViewListAdapter();		
		File dir = getFilesDir();
		String extension = getResources().getString(R.string.extDeckExtension);
		List<String> dirList = Arrays.asList(dir.list());
		Collections.sort(dirList);
		
		for (String filename : dirList)
			if (filename.endsWith(extension))
				addDeck(filename);
		updateButtonState();
		
		listView.setAdapter(viewListAdapter);
	}
		
	public void persist() {
		
	}
	
	public void restore() {
		//Load state
		populate();
	}
	
	public void updateButtonState(){
		Button buttonResume = (Button) findViewById(R.id.ndfdeckchooserButtonResume);
		Button buttonDel = (Button) findViewById(R.id.ndfdeckchooserButtonDelete);
		Button buttonEdit = (Button) findViewById(R.id.ndfdeckchooserButtonEdit);
		Button buttonQuiz = (Button) findViewById(R.id.ndfdeckchooserButtonQuiz);
		
		if ((selectedDeck < 0) && (lastQuizDeck == null))
			buttonResume.setEnabled(false);
		else
			buttonResume.setEnabled(true);
		
		if (selectedDeck < 0){
			buttonDel.setEnabled(false);
			buttonEdit.setEnabled(false);
			buttonQuiz.setEnabled(false);
		}
		else {
			buttonDel.setEnabled(true);
			buttonEdit.setEnabled(true);
			buttonQuiz.setEnabled(true);
		}			
	}	
	
	private class NewDeckModal extends Dialog {			
		EditText deckName;
		AutoCompleteTextView description;
		
		NewDeckModal(Context context) {
			super(context);    		
    	}		
		
		private void init() {			
			setTitle(getResources().getString(R.string.titleNewDeck));
			deckName = (EditText) findViewById(R.id.ndfdeckchoosernewdeckName);
			description = (AutoCompleteTextView) findViewById(R.id.ndfdeckchoosernewdeckDescription);
			
			setOnShowListener(new DialogInterface.OnShowListener() {				
				public void onShow(DialogInterface dialog) {
					deckName.setText("");
					description.setText("");
				}
			});
			
			Button buttonOk = (Button) findViewById(R.id.ndfdeckchoosernewdeckButtonOk);			
			buttonOk.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					 newDeck();
					 cancel();
				}
			});
			
			Button buttonCancel = (Button) findViewById(R.id.ndfdeckchoosernewdeckButtonCancel);
			buttonCancel.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					cancel();				
				}
			});			
		}
		
		private void newDeck() {
			String name = deckName.getText().toString();
			String desc = description.getText().toString();
			if ((name == null) || (name.trim().equalsIgnoreCase("")))
				return;
			new NDFDeck(name, desc, ActNDFDeckChooser.this);
			populate();						
		}
		
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
	        setContentView(R.layout.ndfdeckchoosernewdeck);
	        LayoutParams params = getWindow().getAttributes(); 
            params.height = LayoutParams.FILL_PARENT;
            params.width = LayoutParams.FILL_PARENT;
            getWindow().setAttributes((android.view.WindowManager.LayoutParams) params); 
	    	init();	    		       
		}					
	}
	
	private class ViewListAdapter extends BaseAdapter implements ListAdapter {

		private ArrayList<View> views = new ArrayList<View>();
		
		public void add(View view){
			if (view != null)
				views.add(view);
		}
		
		public int getCount() {
			return views.size();
		}

		public Object getItem(int position) {
			return null;
		}

		public long getItemId(int position) {
			return 0;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			return views.get(position);
		}		
	}
}
