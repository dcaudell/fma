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
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class ActNDFDeckChooser extends ActBase {
	
	static final int DIALOG_NEWDECK = 0;
	static final int DIALOG_DELDECK = 1;

	private ArrayList<String> deckFilenames;
	private ListView listView;
	private View selectedView;
	private ViewListAdapter viewListAdapter;
	private String lastQuizDeckFilename;
	private String quizFilename;
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
		deckFilenames.add(filename);
		viewListAdapter.add(view);
	}
	
	private void deleteDeck() {		
		String filename = deckFilenames.get(selectedDeck);
		if (filename.equals(lastQuizDeckFilename))
			lastQuizDeckFilename = null;
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
		String filename = deckFilenames.get(selectedDeck);
		Bundle bundle = new Bundle();
		bundle.putString(getResources().getString(R.string.tagNDFDeckFilename), filename);		
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
		
		Button buttonQuiz = (Button) findViewById(R.id.ndfdeckchooserButtonQuiz);
		buttonQuiz.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				newQuiz();				
			}
		});
		
		Button buttonResume = (Button) findViewById(R.id.ndfdeckchooserButtonResume);
		buttonResume.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				resumeQuiz();
			}
		});
				
		listView = (ListView) findViewById(R.id.ndfdeckchooserListView);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
				selectDeck(pos);
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
	
	private void newQuiz() {
		String deckFilename = deckFilenames.get(selectedDeck);
		NDFDeck deck = NDFPersistent.load(deckFilename, ActNDFDeckChooser.this, NDFDeck.class);
		NDFQuiz ndfQuiz = new NDFQuiz(deck, ActNDFDeckChooser.this);		
		deck.setQuizFile(ndfQuiz.getFilename());
		deck.persist(this);
		lastQuizDeckFilename = deckFilename;
		persist();
		updateButtonState();
		Bundle bundle = new Bundle();
		bundle.putString(getResources().getString(R.string.tagNDFQuizFilename), ndfQuiz.getFilename());		
		Intent intent = new Intent(this, ActNDFQuiz.class);
		intent.putExtras(bundle);
		startActivity(intent);
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
		deckFilenames = new ArrayList<String>();
		viewListAdapter = new ViewListAdapter();		
		File dir = getFilesDir();
		String extension = getResources().getString(R.string.extDeckExtension);
		List<String> dirList = Arrays.asList(dir.list());
		Collections.sort(dirList);
		
		for (String filename : dirList)
			if (filename.endsWith(extension))
				addDeck(filename);
		
		listView.setAdapter(viewListAdapter);
		
		if (selectedDeck >= deckFilenames.size())
			selectedDeck = -1;			
		
		updateButtonState();
		
		if (selectedDeck > -1)
			selectDeck(selectedDeck);
	}
		
	public void persist() {
		SharedPreferences sp = getSharedPreferences(getResources().getString(R.string.tagNDFDeckChooserPrefs), Context.MODE_PRIVATE);
    	Editor editor = sp.edit();
    	editor.putString(getResources().getString(R.string.tagNDFDeckChooserLastQuizDeck), lastQuizDeckFilename);
    	editor.putInt(getResources().getString(R.string.tagNDFDeckChooserSelectedDeck), selectedDeck);    	
    	editor.commit();
	}
	
	public void restore() {		
		SharedPreferences sp = getSharedPreferences(getResources().getString(R.string.tagNDFDeckChooserPrefs), Context.MODE_PRIVATE);    	
    	lastQuizDeckFilename = sp.getString(getResources().getString(R.string.tagNDFDeckChooserLastQuizDeck), null);    	    
    	selectedDeck = sp.getInt(getResources().getString(R.string.tagNDFDeckChooserSelectedDeck), -1);    
		populate();
	}
	
	public void resumeQuiz() {
		NDFQuiz ndfQuiz = NDFPersistent.load(quizFilename, this, NDFQuiz.class);
		if (ndfQuiz == null)
			return;
		lastQuizDeckFilename = ndfQuiz.getDeckFilename();
		persist();
		
		Bundle bundle = new Bundle();
		bundle.putString(getResources().getString(R.string.tagNDFQuizFilename), quizFilename);		
		Intent intent = new Intent(this, ActNDFQuiz.class);
		intent.putExtras(bundle);
		startActivity(intent);
	}
	
	private void selectDeck(int pos){
		listView.setSelection(pos);												
		if (selectedView != null)
			selectedView.setBackgroundColor(getResources().getColor(R.color.colorBlack));
		selectedView = viewListAdapter.getView(pos, null, null);		
		selectedView.setBackgroundColor(getResources().getColor(R.color.colorDeckSelected));
		selectedDeck = pos;
		updateButtonState();
		persist();
	}
	
	public void updateButtonState(){
		Button buttonResume = (Button) findViewById(R.id.ndfdeckchooserButtonResume);
		Button buttonDel = (Button) findViewById(R.id.ndfdeckchooserButtonDelete);
		Button buttonEdit = (Button) findViewById(R.id.ndfdeckchooserButtonEdit);
		Button buttonQuiz = (Button) findViewById(R.id.ndfdeckchooserButtonQuiz);
				
		String deckFilename = ((selectedDeck < 0) || (deckFilenames.size() < 1)) ? lastQuizDeckFilename : deckFilenames.get(selectedDeck);	
		NDFDeck ndfDeck = null;
		if (deckFilename != null)
			ndfDeck = NDFPersistent.load(deckFilename, this, NDFDeck.class);		
		
		quizFilename = null;
		if (ndfDeck != null)
			quizFilename = ndfDeck.getQuizFile();					
		
		buttonResume.setEnabled(false);		
		if (quizFilename != null)
			if (new File(getFilesDir(), quizFilename).exists())		
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
			selectedDeck = -1;
			persist();
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
}
