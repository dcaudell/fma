package com.xtrafe.mobile.fma;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;

public class NDFDeck
	extends NDFPersistent	
{	
	private static final long serialVersionUID = -7606489484835531452L;
	private List<NDFCard> cards;
	private String name;
	private String desc;
	private String filename;
	private long lastModified;
	private String quizFile;
	
	public NDFDeck(String name, String desc, Context context) {
		this.name = name;
		this.desc = desc;
		lastModified = System.currentTimeMillis();
		cards = new ArrayList<NDFCard>();
		resolveFilename(context);
		persist(context);
	}
	
	public void delCard(int pos){
		cards.remove(pos);
	}
	
	public NDFCard getCard(int pos){
		return cards.get(pos);
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public long getLastModified() {		
		return lastModified;
	}
	
	public String getName() {
		return name;
	}
	
	public String getQuizFile() {
		return quizFile;
		
	}	
	
	public NDFCard newCard(int pos){
		NDFCard ndfCard = new NDFCard();
		cards.add(pos, ndfCard);
		return ndfCard;
	}	
	
	private void resolveFilename(Context context) {
		filename = name.split("\\s", 2)[0];
		String extension = context.getResources().getString(R.string.extDeckExtension);
		File dir = context.getFilesDir();
		int i = 0;
		while (new File(dir, filename + i + extension).exists())
			i++;
		filename = filename + i + extension;		
	}
	
	public void setDesc(String desc){
		this.desc = desc;
	}	
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setQuizFile(String quizFile){
		this.quizFile = quizFile;
	}
	
	public int size() {
		return cards.size();
	}
	
	public class NDFCard 
		implements Serializable
	{		
		private static final long serialVersionUID = -2103660881266177498L;
		private List<NDFCardFace> faces;		
		private NDFCard() {		
			faces = new ArrayList<NDFCardFace>();
		}
	
		public void delFace(int pos){
			faces.remove(pos);
		}
		
		public NDFDeck getDeck() {
			return NDFDeck.this;
		}
		
		public NDFCardFace getFace(int pos) {
			return faces.get(pos);
		}
		
		public NDFCardFace newFace(int pos) {
			NDFCardFace ndfCardFace = new NDFCardFace();			
			faces.add(pos, ndfCardFace);
			return ndfCardFace;
		}
		
		public void persist(Context context){
			lastModified = System.currentTimeMillis();
			NDFDeck.this.persist(context);
		}
		
		public int size() {
			return faces.size();			
		}
		
		public class NDFCardFace 
			implements Serializable
		{			
			private static final long serialVersionUID = -3899588844334707142L;
			private String cardText;
			private int textSize;			
			
			private NDFCardFace() {				
			}
			
			public NDFCard getCard(){
				return NDFCard.this;
			}
			
			public String getText(){
				return cardText;
			}
			
			public int getTextSize() {
				return textSize;
			}
			
			public void persist(Context context){
				lastModified = System.currentTimeMillis();
				NDFCard.this.persist(context);
			}
			
			public void setText(String cardText){
				this.cardText = cardText;
			}
			
			public void setTextSize(int textSize){
				this.textSize = textSize;
			}					
		}
	}
}
