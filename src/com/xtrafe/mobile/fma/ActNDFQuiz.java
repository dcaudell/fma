package com.xtrafe.mobile.fma;

import com.xtrafe.mobile.fma.NDFDeck.NDFCard.NDFCardFace;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.TextView;

public class ActNDFQuiz 
	extends ActBase
{
	private static final int DIALOG_QUIZCOMPLETE = 0;
	
	private NDFQuiz ndfQuiz;
	private String ndfQuizFilename;
	private int currentFaceNum;	
	
	private void correct() {
		//Can happen if you spam the correct button.
		if (ndfQuiz.current() == null)
			return;
		
		ndfQuiz.current().correct();
		ndfQuiz.persist(this);
		if (ndfQuiz.remaining() < 1) {
			showDialog(DIALOG_QUIZCOMPLETE);
			return;
		}
		currentFaceNum = 0;
		populate();
	}
	
	private void flip() {
		currentFaceNum = (currentFaceNum + 1) % ndfQuiz.current().size();		
		populate();
	}
	
	private void incorrect() {
		ndfQuiz.current().incorrect();
		ndfQuiz.persist(this);
		currentFaceNum = 0;
		populate();
	}
	
	private void init() {
		Button correctButton = (Button) findViewById(R.id.ndfquizButtonCorrect);
		correctButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				correct();				
			}
		});
		
		Button flipButton = (Button) findViewById(R.id.ndfquizButtonFlip);
		flipButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				flip();			
			}
		});
		
		Button incorrectButton = (Button) findViewById(R.id.ndfquizButtonIncorrect);
		incorrectButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {			
				incorrect();
			}
		});
		
		Button kindaButton = (Button) findViewById(R.id.ndfquizButtonKinda);
		kindaButton.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {			
				kinda();
			}
		});
	}
	
	private void kinda() {
		ndfQuiz.current().kinda();
		ndfQuiz.persist(this);
		currentFaceNum = 0;
		populate();
	}
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ndfquiz);    	    	    	    	    	   
    	init();
    	
    	Bundle bundle = getIntent().getExtras();
    	String key = getResources().getString(R.string.tagNDFQuizFilename);
    	if ((bundle != null) && bundle.containsKey(key)){
    		logI("Setting initial state from bundle.");
    		populate(NDFPersistent.load(bundle.getString(key), this, NDFQuiz.class));    		
    		getIntent().removeExtra(key);
    	}
    	else
    		restore();    	    
    	
        logI("Born.");
    }
	
	protected Dialog onCreateDialog(int id){
		switch (id) {
			case DIALOG_QUIZCOMPLETE:
				return new QuizCompleteDialog(this);			
			default:
				return null;
		}
	}
	
	private void persist() {
		SharedPreferences sp = getSharedPreferences(getResources().getString(R.string.tagNDFQuizPrefs), Context.MODE_PRIVATE);
    	Editor editor = sp.edit();
    	editor.putString(getResources().getString(R.string.tagNDFQuizFilename), ndfQuizFilename);
    	editor.putInt(getResources().getString(R.string.tagNDFQuizCurrentFace), currentFaceNum);    	
    	editor.commit();
	}
	
	private void populate() {
		populate(ndfQuiz, currentFaceNum);
	}
	
	private void populate(NDFQuiz ndfQuiz){
		populate(ndfQuiz, 0);
	}
	
	private void populate(NDFQuiz ndfQuiz, int currentFaceNum){
		this.ndfQuiz = ndfQuiz;
		this.currentFaceNum = currentFaceNum;
		this.ndfQuizFilename = ndfQuiz.getFilename();			
		
		if (ndfQuiz.remaining() < 1){
			finish();
			return;
		}
		
		TextView quizText = (TextView) findViewById(R.id.ndfquizText);
		TextView remainingText = (TextView) findViewById(R.id.ndfquizLabelRemaining);
		
		remainingText.setText(getResources().getString(R.string.labelRemaining) + ndfQuiz.remaining());					
		
		NDFCardFace curFace = ndfQuiz.current().getFace(currentFaceNum);
		quizText.setText(curFace.getText());
		quizText.setTextSize(curFace.getTextSize());
		
		persist();
	}	
	
	public void restore() {
		SharedPreferences sp = getSharedPreferences(getResources().getString(R.string.tagNDFQuizPrefs), Context.MODE_PRIVATE);    	
    	ndfQuizFilename = sp.getString(getResources().getString(R.string.tagNDFQuizFilename), null);
    	if (ndfQuizFilename == null){
    		logI("deckFile was null while restoring.");
    		return;
    	}    	
    	currentFaceNum = sp.getInt(getResources().getString(R.string.tagNDFQuizCurrentFace), 0);
    	ndfQuiz = NDFPersistent.load(ndfQuizFilename, this, NDFQuiz.class);
    	    		
    	populate();
	}
	
	private class QuizCompleteDialog extends Dialog
	{
		public QuizCompleteDialog(Context context) {
			super(context); 
		}
		
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
	        setContentView(R.layout.ndfquizcomplete);
	        setCancelable(false);
	    	init();	    		       
		}			
		
		private void init() {
			
			setTitle(getResources().getString(R.string.titleCongratulations));
			
			final TextView textCorrect = (TextView) findViewById(R.id.ndfquizcompleteCorrect);
			final TextView textIncorrect = (TextView) findViewById(R.id.ndfquizcompleteIncorrect);
			final TextView textTotal = (TextView) findViewById(R.id.ndfquizcompleteTotal);
			final TextView textScore = (TextView) findViewById(R.id.ndfquizcompleteScore);
			
			setOnShowListener(new DialogInterface.OnShowListener() {				
				public void onShow(DialogInterface dialog) {
					textCorrect.setText(String.valueOf(ndfQuiz.correct()));
					textIncorrect.setText(String.valueOf(ndfQuiz.incorrect()));
					textTotal.setText(String.valueOf(ndfQuiz.total()));
					textScore.setText(String.format("%.2f%%", ndfQuiz.score()));
				}
			});
			
			Button retryButton = (Button) findViewById(R.id.ndfquizcompleteButtonRetry);
			retryButton.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {
					retry();
				}
			});
			
			Button quitButton = (Button) findViewById(R.id.ndfquizcompleteButtonQuit);
			quitButton.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View v) {					
					quit();
				}
			});
		}
		
		private void quit() {
			ndfQuiz.reset();
			ndfQuiz.persist(ActNDFQuiz.this);
			dismiss();
			finish();
		}
		
		private void retry() {
			ndfQuiz.reset();
			ndfQuiz.persist(ActNDFQuiz.this);
			currentFaceNum = 0;
			populate();
			dismiss();
		}
	}
}