package com.xtrafe.mobile.fma;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


import android.content.Context;

import com.xtrafe.mobile.fma.NDFDeck.NDFCard;

public class NDFQuiz
	extends NDFPersistent
{
	private int correct;
	private int incorrect;
	private int total;
	private String filename;
	
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
		Collections.shuffle(questions);
		resolveFilename(context);
		persist(context);
	}
	
	public double currentScore() {
		return correct / total;
	}
	
	public NDFQuestion next() {
		return questions.peek();
	}
	
	public String getFilename() {
		return filename;
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
	
	public int size() {
		return questions.size();
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
		
		public NDFCard getCard() {
			return deck.getCard(cardNum);
		}
		
		public int getFace() {
			return faceNum;
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
		
		public void kinda() {
			questions.remove(this);
			questions.add(this);
			if (!seenBefore)
				incorrect++;
			seenBefore = true;
		}
		
		public void persist(Context context) {
			NDFQuiz.this.persist(context);
		}			
	}
}
