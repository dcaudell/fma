package com.xtrafe.mobile.fma;

import java.util.ArrayList;

import com.xtrafe.mobile.fma.NDFDeck.NDFCard;
import com.xtrafe.mobile.fma.NDFDeck.NDFCard.NDFCardFace;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ZoomControls;

public class ActNDFDeckEditor extends ActBase {	
	static final int DIALOG_DELFACE = 0;
	static final int DIALOG_DELCARD = 1;
	static final int DIALOG_EDITOR  = 2;
	
	private NDFCardEditor ndfCardEditor;
	private NDFDeck deck;
	private String deckFile;
	private int currentCardNum;
	private int currentFaceNum;
	
	private void addCard() {					
		NDFCard newCard = deck.newCard(++currentCardNum);		
		newCard.persist(this);
		currentFaceNum = -1;
		populate();		
	}
	
	private void delCard() {
		deck.delCard(currentCardNum--);
		deck.persist(this);
		currentFaceNum = -1;
		populate();
	}	
	
	private Dialog getDelCardDialog() {
		return getAlertDialog(getResources().getString(R.string.titleDeleteCard), new DialogInterface.OnClickListener() {				
			public void onClick(DialogInterface dialog, int which) {
				delCard();					
			}
		});    		    	
	}
	
	private void init() {
		Button addButton = (Button) findViewById(R.id.ndfdeckeditorButtonAdd);
		addButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				addCard();
			}
		});
		
		Button delButton = (Button) findViewById(R.id.ndfdeckeditorButtonDel);
		delButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				showDialog(DIALOG_DELCARD);		
			}
		});
		
		Button nextButton = (Button) findViewById(R.id.ndfdeckeditorButtonNext);
		nextButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				nextCard();
			}
		});
		
		Button prevButton = (Button) findViewById(R.id.ndfdeckeditorButtonPrev);
		prevButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				prevCard();				
			}
		});
    }
	
	private void logStatus() {
    	logI("currentCardNum = " + currentCardNum);
    	logI("currentFaceNum = " + currentFaceNum);
    	
    	if (deck != null)
    		logI("Deck: " + deck.getName());
    	else {
    		logI("Deck: null");
    		return;
    	}
    	
    	logI("numCards = " + deck.size());
    	if (deck.size() < 1)
    		return;
    	
    	logI("numFaces = " + deck.getCard(currentCardNum).size());
    	//new Exception().printStackTrace();
    }	
	
	private void nextCard(){
		currentCardNum++;
		currentFaceNum = -1;
		populate();
	}	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ndfdeckeditor);    	
    	LinearLayout host = (LinearLayout) findViewById(R.id.ndfdeckeditorLayoutHost);    	    	
    	ndfCardEditor = new NDFCardEditor(host);    	
    	init();
    	
    	Bundle bundle = getIntent().getExtras();
    	String key = getResources().getString(R.string.tagNDFDeckFilename);
    	if ((bundle != null) && bundle.containsKey(key)){
    		currentCardNum = -1;
    		currentFaceNum = -1;
    		logI("Setting initial state from bundle.");
    		populate(NDFPersistent.load(bundle.getString(key), this, NDFDeck.class));    		
    		getIntent().removeExtra(key);
    	}
    	else
    		restore();    	    
    	
        logI("Born.");
    }       
    
    protected Dialog onCreateDialog(int id){
    	switch (id) {
    		case DIALOG_DELFACE:
    			return ndfCardEditor.getDelFaceDialog();
    		case DIALOG_DELCARD:
    			return getDelCardDialog();
    		case DIALOG_EDITOR:
    			return ndfCardEditor.getEditorDialog((ViewGroup) findViewById(R.layout.ndfdeckeditor));
    		default:
    			return null;
    	}    	
    }       
    
    private void persist() {
    	SharedPreferences sp = getSharedPreferences(getResources().getString(R.string.tagNDFDeckEditorPrefs), Context.MODE_PRIVATE);
    	Editor editor = sp.edit();
    	editor.putString(getResources().getString(R.string.tagNDFDeckEditorDeckFilename), deckFile);
    	editor.putInt(getResources().getString(R.string.tagNDFDeckEditorCurrentCard), currentCardNum);
    	editor.putInt(getResources().getString(R.string.tagNDFDeckEditorCurrentFace), currentFaceNum);
    	editor.commit();
    }
    
    protected void populate() {
    	populate(deck, currentCardNum);
    }
        
    public void populate(NDFDeck deck){    	
    	populate(deck, 0);    	
    }
    
    public void populate(NDFDeck deck, int cardNum){
    	this.deck = deck;
    	this.deckFile = deck.getFilename();
    	this.currentCardNum = cardNum;
    	
    	if (deck.size() < 1)
    		currentCardNum = -1;
    	else if (currentCardNum < 0)
    		currentCardNum = 0;
    	
    	Button nextButton = (Button) findViewById(R.id.ndfdeckeditorButtonNext);
    	Button prevButton = (Button) findViewById(R.id.ndfdeckeditorButtonPrev);
    	Button delButton = (Button) findViewById(R.id.ndfdeckeditorButtonDel);
    	Button addButton = (Button) findViewById(R.id.ndfdeckeditorButtonAdd);
    	
    	switch (deck.size()){
    		case 0:    			
    		case 1:
    			nextButton.setEnabled(false);        		
        		prevButton.setEnabled(false);        		
        		delButton.setEnabled(false);
        		addButton.setEnabled(true);    			
        		break;
    		default:
    			if (currentCardNum < (deck.size() - 1))
    				nextButton.setEnabled(true);
    			else
    				nextButton.setEnabled(false);
    			
    			if (currentCardNum > 0)
    				prevButton.setEnabled(true);
    			else
    				prevButton.setEnabled(false);
    			delButton.setEnabled(true);
    			addButton.setEnabled(true);    			
    	}    	    	    
    	
    	if (deck.size() == 0)
    		ndfCardEditor.populate(null, 0);
    	else
    		ndfCardEditor.populate(deck.getCard(currentCardNum), currentFaceNum);
    	
    	persist();
    }       
    
    private void prevCard() {
    	currentCardNum--;
    	currentFaceNum = -1;
    	populate();
    }
    
    private void restore() {    	
    	SharedPreferences sp = getSharedPreferences(getResources().getString(R.string.tagNDFDeckEditorPrefs), Context.MODE_PRIVATE);    	
    	deckFile = sp.getString(getResources().getString(R.string.tagNDFDeckEditorDeckFilename), null);
    	if (deckFile == null){
    		logI("deckFile was null while restoring.");
    		return;
    	}
    	currentCardNum = sp.getInt(getResources().getString(R.string.tagNDFDeckEditorCurrentCard), -1);
    	currentFaceNum = sp.getInt(getResources().getString(R.string.tagNDFDeckEditorCurrentFace), -1);
    	deck = NDFPersistent.load(deckFile, this, NDFDeck.class);
    	if (deck == null){
    		deckFile = null;
    		currentCardNum = -1;
    		currentFaceNum = -1;
    		persist();
    		return;
    	}    		
    	populate();    	
    }
    
    private class NDFCardEditor {    	
    	
    	public NDFCardEditor(ViewGroup viewGroup) {    		
    		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);    		
    		inflater.inflate(R.layout.ndfcardeditor, viewGroup);		
    		init();    		
    	}
    	
    	private void addFace() {
    		NDFCard currentCard = deck.getCard(currentCardNum);				
			NDFCardFace newFace = currentCard.newFace(++currentFaceNum);
			newFace.setText(getResources().getString(R.string.textNewSide));
			newFace.setTextSize(getResources().getInteger(R.integer.fontscaleCardTextDirect));
			newFace.persist(ActNDFDeckEditor.this);
			ActNDFDeckEditor.this.populate();
    	}
    	
    	private void delFace() {
    		NDFCard currentCard = deck.getCard(currentCardNum);    			    		
			currentCard.delFace(currentFaceNum--);
			currentCard.persist(ActNDFDeckEditor.this);
			ActNDFDeckEditor.this.populate();
    	}
    	
    	public Dialog getDelFaceDialog() {
    		return getAlertDialog(getResources().getString(R.string.titleDeleteSide), new DialogInterface.OnClickListener() {				
				public void onClick(DialogInterface dialog, int which) {
					delFace();					
				}
			});    		    	
    	}
    	
    	public Dialog getEditorDialog(ViewGroup viewGroup) {
    		return new NDFTextEditor(ActNDFDeckEditor.this);
    	}
    	
    	private void init(){
    		Button addButton = (Button) findViewById(R.id.ndfcardeditorButtonAdd);
    		addButton.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					addFace();
				}
			});
    		
    		Button delButton = (Button) findViewById(R.id.ndfcardeditorButtonDel);
    		delButton.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					showDialog(DIALOG_DELFACE);				
				}
			});
    		
    		Button nextButton = (Button) findViewById(R.id.ndfcardeditorButtonNext);
    		nextButton.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					nextFace();					
				}
			});
    		
    		Button prevButton = (Button) findViewById(R.id.ndfcardeditorButtonPrev);
    		prevButton.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					prevFace();
				}
			});
    		
    		
    		ZoomControls zoomControls = (ZoomControls) findViewById(R.id.ndfcardeditorZoomControls);    		
    		zoomControls.setOnZoomInClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					resizeText(getResources().getInteger(R.integer.fontscaleCardTextIncrement));				
				}
			});
    		    		    		    	
    		zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					resizeText(getResources().getInteger(R.integer.fontscaleCardTextIncrement)  * -1);
				}
			});
    		
    		final Spinner spinner = (Spinner) findViewById(R.id.ndfcardeditorSpinner);
    		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    			
				public void onItemSelected(AdapterView<?> parent, View itemSelected, int pos, long selectedId) {
					if (pos != currentFaceNum)
						setFace(pos);					
				}

				public void onNothingSelected(AdapterView<?> arg0) {
					//Do nothing
				}
			});
    		
    		TextView textView = (TextView) findViewById(R.id.ndfcardeditorText);
    		textView.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {					
					showDialog(DIALOG_EDITOR);				
				}
			});
    	}
    	
    	private void nextFace() {
    		currentFaceNum++;
    		ActNDFDeckEditor.this.populate();
    	}
    	
    	private void prevFace() {
    		currentFaceNum--;
    		ActNDFDeckEditor.this.populate();
    	}
    	
    	public void populate(NDFCard card, int face){
    		TextView cardLabel = (TextView) findViewById(R.id.ndfcardeditorLabelCard);
    		Button nextButton = (Button) findViewById(R.id.ndfcardeditorButtonNext);    		
    		Button prevButton = (Button) findViewById(R.id.ndfcardeditorButtonPrev);
    		Button addButton = (Button) findViewById(R.id.ndfcardeditorButtonAdd);
    		Button delButton = (Button) findViewById(R.id.ndfcardeditorButtonDel);    		
    		ZoomControls zoomControls = (ZoomControls) findViewById(R.id.ndfcardeditorZoomControls);    		    	
    		Spinner spinner = (Spinner) findViewById(R.id.ndfcardeditorSpinner);
    		TextView cardText = (TextView) findViewById(R.id.ndfcardeditorText);    		
    		
    		currentFaceNum = face;
    		if ((card == null) || (card.size() < 1))
    			currentFaceNum = -1;
    		else if (currentFaceNum < 0)
    			currentFaceNum = 0;    		    		   
    		    		    		
    		int spinnerSize = (card == null) ? 0 : card.size();
    		String[] numbers = new String[spinnerSize];
			for (int i = 0; i < numbers.length; i++)				
				numbers[i] = String.valueOf(i + 1);
			
			//ArrayAdapter<String> adapter = new ArrayAdapter<String>(ActNDFDeckEditor.this, android.R.layout.simple_spinner_dropdown_item, numbers);
			
			SpinnerAdapter adapter = new SpinnerAdapter(numbers);
			spinner.setAdapter(adapter);			
			if (currentFaceNum >= 0)					
				spinner.setSelection(currentFaceNum, true);						
    		
    		if (card == null){    			
    			addButton.setEnabled(false);
    			delButton.setEnabled(false);    			
    			nextButton.setEnabled(false);
    			prevButton.setEnabled(false);    			
    			spinner.setEnabled(false);
    			zoomControls.setEnabled(false);
    			
    			cardLabel.setText("");
    			
    			cardText.setEnabled(false);
    			cardText.setText(getResources().getString(R.string.textAddACard));
    			cardText.setTextSize(getResources().getInteger(R.integer.fontscaleCardTextDirect));
    			return;
    		}
    		
    		cardLabel.setText(getResources().getString(R.string.labelCard) 
    				+ " " 
    				+ (currentCardNum + 1)
    				+ " / "
    				+ deck.size());
    		
    		if (card.size() == 0){
    			addButton.setEnabled(true);
    			delButton.setEnabled(false);    			
    			nextButton.setEnabled(false);
    			prevButton.setEnabled(false);    			    		    			
    			spinner.setEnabled(false);
    			zoomControls.setEnabled(false);
    			
    			cardText.setEnabled(false);
    			cardText.setText(getResources().getString(R.string.textAddASide));
    			cardText.setTextSize(getResources().getInteger(R.integer.fontscaleCardTextDirect));    							    		
				return;
    		}
    		    		
    		
    		addButton.setEnabled(true);
			delButton.setEnabled(true);
			zoomControls.setEnabled(true);
			spinner.setEnabled(true);
			
			if (currentFaceNum < (card.size() - 1))
				nextButton.setEnabled(true);
			else 
				nextButton.setEnabled(false);
			
			if (currentFaceNum > 0)
				prevButton.setEnabled(true);
			else
				prevButton.setEnabled(false);
    		    					
			cardText.setEnabled(true);
			cardText.setText(card.getFace(currentFaceNum).getText());
			cardText.setTextSize(card.getFace(currentFaceNum).getTextSize());
    	}
    	
    	private void resizeText(int amount) {
    		NDFCard currentCard = deck.getCard(currentCardNum);
    		NDFCardFace currentFace = currentCard.getFace(currentFaceNum);
    		currentFace.setTextSize(currentFace.getTextSize() + amount);
    		currentFace.persist(ActNDFDeckEditor.this);
    		ActNDFDeckEditor.this.populate();
    	}
    	
    	private void setFace(int pos){
    		currentFaceNum = pos;
    		ActNDFDeckEditor.this.populate();
    	}
    	
    	private void setCardFaceText(String text){
    		NDFCard currentCard = deck.getCard(currentCardNum);
    		NDFCardFace currentFace = currentCard.getFace(currentFaceNum);
    		currentFace.setText(text);
    		currentFace.persist(ActNDFDeckEditor.this);
    		ActNDFDeckEditor.this.populate();
    	}
    	
    	private class SpinnerAdapter extends BaseAdapter implements Adapter {
    		private ArrayList<View> views = new ArrayList<View>();
    		private ArrayList<View> dropdownViews = new ArrayList<View>();
    		
    		public SpinnerAdapter(String[] items){
    			for (String item : items){
    				LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    				
    				CheckedTextView dropdownView = (CheckedTextView) inflater.inflate(android.R.layout.simple_spinner_dropdown_item, null);    				
    				dropdownView.setText(getResources().getString(R.string.labelFace) + item);
    				dropdownViews.add(dropdownView);
    				
    				TextView view = (TextView) inflater.inflate(android.R.layout.simple_spinner_item, null);
    				view.setText(item);
    				views.add(view);    				    			
    			}
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
						
			public View getDropDownView(int position, View convertView, ViewGroup parent){
				return dropdownViews.get(position);
			}

			public View getView(int position, View convertView, ViewGroup parent) {
				return views.get(position);
			}
    		
    	}
    	
    	private class NDFTextEditor extends Dialog {
    		
    		private NDFTextEditor (Context context) {
    			super(context);
    		}
    		
    		protected void onCreate(Bundle savedInstanceState) {        		         		      
    			setContentView(R.layout.ndftexteditor);
    			LayoutParams params = getWindow().getAttributes(); 
                params.height = LayoutParams.FILL_PARENT;
                params.width = LayoutParams.FILL_PARENT;
                getWindow().setAttributes((android.view.WindowManager.LayoutParams) params); 
    			init();
    		}    		    	
    		
    		private void init(){
    			
    			setTitle(getResources().getString(R.string.titleEditCardText));
    			
    			final AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.ndftexteditorACTV);    			    			    		
    			
    			setOnShowListener(new DialogInterface.OnShowListener() {					
					public void onShow(DialogInterface dialog) {
						actv.setText(deck.getCard(currentCardNum).getFace(currentFaceNum).getText());
						actv.selectAll();
					}
				});
    			
    			Button saveButton = (Button) findViewById(R.id.ndftexteditorButtonSave);
    			saveButton.setOnClickListener(new View.OnClickListener() {					
					public void onClick(View v) {
						setCardFaceText(actv.getText().toString());
						dismiss();
					}
				});
    			
    			Button cancelButton = (Button) findViewById(R.id.ndftexteditorButtonCancel);
    			cancelButton.setOnClickListener(new View.OnClickListener() {					
					public void onClick(View v) {
						dismiss();						
					}
				});
    		}
    	}
    }
}
