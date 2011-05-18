package com.xtrafe.mobile.fma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.xtrafe.mobile.fma.R;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class ActLogButton extends ActBase {	

	private static boolean firstInstance = true;
	
	private void clearLogs() {
		try {
			ArrayList<String> commandLine = new ArrayList<String>();
	        commandLine.add("logcat");
	        commandLine.add("-c");
	        Runtime.getRuntime().exec(commandLine.toArray(new String[0]));
		}
		catch (IOException e){                
            e.printStackTrace();
        }
		
		TextView outputView = (TextView) findViewById(R.id.logbuttonTextView2);
		outputView.setText("");
	}
	
	
	private void init() {    	
		Button logButton = (Button) findViewById(R.id.logbuttonButtonLog);		
    	logButton.setOnClickListener( new View.OnClickListener() {			
			public void onClick(View v) {
				logI("This is where your log is.");				
			}
		});
    	
    	Button clearButton = (Button) findViewById(R.id.logbuttonButtonClear);
    	clearButton.setOnClickListener( new View.OnClickListener() {			
			public void onClick(View v) {
				clearLogs();
			}
		});    	    	        	    	    	 
    }
	
	@SuppressWarnings("unchecked")
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logbutton_new);
        
        if (firstInstance){
    		//clearLogs();
    		firstInstance = false;
    	}    	
    	new CollectLogTask().execute(new ArrayList<String>());  
        init();
        
        logI("Born,");        
    }		
	
	//This code somewhat boosted from http://code.google.com/p/android-log-collector/source/browse/trunk/android-log-collector/src/com/xtralogic/android/logcollector/SendLogActivity.java
	public class CollectLogTask extends AsyncTask<List<String>, String, StringBuilder>{	
		
		@Override
		protected StringBuilder doInBackground(List<String>... params) {			
            try{            	            	
                
            	ArrayList<String> commandLine = new ArrayList<String>();                
                commandLine.add("logcat");
                commandLine.add("-v");
                commandLine.add("tag");
                commandLine.add("AndroidRuntime:E " + StatGlob.appTag + ":V *:S" );                              
                
                List<String> arguments = ((params != null) && (params.length > 0)) ? params[0] : null;
                if (arguments != null)
                    commandLine.addAll(arguments);                
                
                Process process = Runtime.getRuntime().exec(commandLine.toArray(new String[0]));                
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));                
                String line;
                while(bufferedReader.ready())
                	bufferedReader.readLine();
                
                while ((line = bufferedReader.readLine()) != null){                
                    publishProgress(line); 
                }
            } 
            catch (IOException e){                
                e.printStackTrace();
            } 

            return new StringBuilder();			
		}
		
		protected void onProgressUpdate(String... messages){			
			for (String message : messages){
				TextView outputView = (TextView) findViewById(R.id.logbuttonTextView2);
				if (outputView != null)
					outputView.append(message + "\n");				
			}
			
			final ScrollView scrollView = (ScrollView) findViewById(R.id.logbuttonScrollView);    	
	    	scrollView.post(new Runnable() {
	    		public void run() {
	    			scrollView.fullScroll(View.FOCUS_DOWN);
	    		}
	    	});	
		}
	}
}
