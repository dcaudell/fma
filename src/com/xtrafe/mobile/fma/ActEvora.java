package com.xtrafe.mobile.fma;

import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class ActEvora 
	extends ActBase
{
	private enum EvoraStates {
		NORMAL,
		SHORT
	}
	private EvoraStates evoraState;	
	
	private void changeState() {		
		Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
		int orientation = display.getRotation();		
		int bgResID = 0;
		int labelResID = 0;			
		
		switch (orientation) {
			case Surface.ROTATION_0:
			case Surface.ROTATION_180:
				if (evoraState == EvoraStates.NORMAL)
					bgResID = R.drawable.evora;
				else 
					bgResID = R.drawable.evora_rotated;			
				break;
			case Surface.ROTATION_90:
			case Surface.ROTATION_270:
				if (evoraState == EvoraStates.NORMAL)
					bgResID = R.drawable.evora_rotated;
				else
					bgResID = R.drawable.evora;
				break;
		}
		
		switch (evoraState) {
			case NORMAL:
				labelResID = R.string.labelSeeWhatIMean;
				evoraState = EvoraStates.SHORT;
				break;
			case SHORT:
				labelResID = R.string.labelHuh;
				evoraState = EvoraStates.NORMAL;
				break;
		}
		
		Button evoraButton = (Button) findViewById(R.id.evoraButton);
		View layout = findViewById(R.id.evoraLayout);
		evoraButton.setText(getResources().getString(labelResID));
		layout.setBackgroundDrawable(getResources().getDrawable(bgResID));		
	}
	
	private void init() {				
		Button evoraButton = (Button) findViewById(R.id.evoraButton);		
    	evoraButton.setOnClickListener( new View.OnClickListener() {			
			public void onClick(View v) {
				changeState();
			}
		});
    }
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evora);
        evoraState = EvoraStates.NORMAL;
        init();
        logI("Born.");
    }	
}
