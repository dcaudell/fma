package com.xtrafe.mobile.fma;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


import android.content.Context;

import com.xtrafe.mobile.fma.NDFDeck.NDFCard;
import com.xtrafe.mobile.fma.NDFDeck.NDFCard.NDFCardFace;

public class NDFQuiz
	extends NDFPersistent
{
	private int correct;
	private int incorrect;
	private int total;
	private String filename;
	private long lastModified;
	
	private NDFDeck deck;
	private LinkedList<NDFQuestion> questions = new LinkedList<NDFQuestion>();
	private ArrayList<NDFQuestion> done = new ArrayList<NDFQuestion>();
	
	public NDFQuiz(NDFDeck deck, Context context){
		this.deck = deck;		
		
		for (int i = 0; i < deck.size(); i++){
			NDFCard curCard = deck.getCard(i);
			for (int j = 0; j < curCard.size(); j++){
				new NDFQuestion(i, j);
				total++;
			}
		}		
		Collections.shuffle(questions, new Random());
		resolveFilename(context);
		lastModified = System.currentTimeMillis();
		persist(context);
	}
	
	public int correct() {
		return correct;
	}	
	
	public NDFQuestion current() {
		return questions.peek();
	}
	
	public String getFilename() {
		return filename;
	}
	
	public String getDeckFilename() {
		return deck.getFilename();
	}
	
	public String getDeckListing() {
		StringBuffer buff = new StringBuffer();
		for (NDFQuestion question : questions)
			buff.append(question.getId() +  "\n");
		return buff.toString();
	}
	
	public int incorrect() {
		return incorrect;
	}
	
	public void reset() {
		questions.addAll(done);
		done.clear();
		Collections.shuffle(questions);
		correct = 0;
		incorrect = 0;		
	}
	
	private void resolveFilename(Context context) {				
		String extension = context.getResources().getString(R.string.extQuizExtension);
		filename = deck.getFilename() + extension;					
	}
	
	public int remaining() {
		return questions.size();
	}
	
	public double score() {
		return ((double) correct / (double) total) * 100.0 ;
	}
	
	public int total() {
		return questions.size() + done.size();
	}	
	
	public class NDFQuestion
		implements Serializable {
					
		private boolean seenBefore = false;
		private int cardNum;
		private int faceNum;
		
		private NDFQuestion(int cardNum, int faceNum) {
			this.cardNum = cardNum;
			this.faceNum = faceNum;
			questions.add(this);
		}
		
		public void correct() {
			questions.remove(this);
			if (!seenBefore)
				correct++;
			done.add(this);
		}
		
		private NDFCard getCard() {
			return deck.getCard(cardNum);
		}
		
		public String getId() {
			return deck.getFilename() + " Card: " + cardNum + " Face: " + faceNum;
		}
		
		public NDFCardFace getFace(int nFlips) {
			int flipFaceNum = (nFlips + faceNum) % deck.getCard(cardNum).size();			
			return getCard().getFace(flipFaceNum);
		}			
		
		public void incorrect() {
			questions.remove(this);			
			if (questions.size() > 7) //The magic memory constant				
				questions.add( (int) ((double) questions.size() / 2.0), this);
			else
				questions.add(this);
			if (!seenBefore)
				incorrect++;
			seenBefore = true;				
		}
		
		public int size() {
			return getCard().size();
		}
		
		public void kinda() {
			questions.remove(this);
			questions.add(this);
			if (!seenBefore)
				incorrect++;
			seenBefore = true;
		}
		
		public void persist(Context context) {
			lastModified = System.currentTimeMillis();
			NDFQuiz.this.persist(context);
		}			
	}
}
