package com.xtrafe.mobile.fma;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;

public abstract class ActTemplate extends ActBase
{
	private void init() {
		//setup event handlers
	}
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.myLayout);        
    	init();
    	restore();    	    	       
        logI("Born.");        
    }
	
	private void persist() {
    	SharedPreferences sp = getSharedPreferences("MyTag", Context.MODE_PRIVATE);
    	Editor editor = sp.edit();
    	//Store state variables
    	editor.commit();
    }
	
	private void populate() {
		//Set state variables
		//Populate interface elements
		persist();
	}
	
	private void restore() {    	
    	SharedPreferences sp = getSharedPreferences("MyTag", Context.MODE_PRIVATE);    	
    	//Restore state variables    	    		
    	populate();    	
    }
}
