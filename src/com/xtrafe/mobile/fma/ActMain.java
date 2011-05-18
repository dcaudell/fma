package com.xtrafe.mobile.fma;

import java.util.ArrayList;
import java.util.List;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ActMain extends ActBase {
	
	static final int DIALOG_DEMOCHOOSER = 0;
	
	private void init() {
    	Button goButton = (Button) findViewById(R.id.mainButtonGo);
    	goButton.setOnClickListener( new View.OnClickListener() {			
			public void onClick(View v) {
				showDialog(DIALOG_DEMOCHOOSER);				
			}
		});
    }
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
        logI("Born,");
    }       
    
    protected Dialog onCreateDialog(int id) {
        Dialog dialog = null;
        switch(id) {
	        case DIALOG_DEMOCHOOSER:	        	
	        	return new DemoChooser().getDialog();	            
	        
	        default:	            
        }
        return dialog;
    }       
    
    private class DemoChooser {    	
    	Dialog dialog;
    	Context context;
    	
    	DemoChooser() {
    		context = ActMain.this;
    		//Context context = getApplicationContext(); //Doesn't work.     		
    		dialog = new Dialog(context);
    		    		    	
    		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    		final View layout = inflater.inflate(R.layout.demochooser, (ViewGroup) findViewById(R.layout.main));
    		
    		List<String> activityNames = new ArrayList<String>();
    		for (DemoActivities demoActivity : DemoActivities.values()){
    			String demoName = getStringResource("demo" + demoActivity.name());
    			if (demoName != null)
    				activityNames.add(demoName);
    		}    			    			    	
    		
    		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(context, R.layout.demochoosermenuitem, activityNames.toArray(new String[0]));    		
    		ListView listView = (ListView) layout.findViewById(R.id.demochooserListView);    		
    		listView.setAdapter(arrayAdapter);
    		listView.setOnItemClickListener(new OnClickListener());
    		dialog.setContentView(layout);
    		dialog.setTitle(getResources().getString(R.string.titleChooseDemo));      		    		    		    	
    	}
    	
    	Dialog getDialog() {    		
    		return dialog;
    	}
    	
    	private class OnClickListener implements AdapterView.OnItemClickListener {
			public void onItemClick(AdapterView<?> arg0, View itemClicked, int position, long id) {				
				try {
					Class<?> clazz = Class.forName(StatGlob.appPackage + "." + DemoActivities.values()[position].name());
					logI("Found demo class " + clazz.getName());
					startActivity(new Intent(context, clazz));		
				}
				catch (Exception e){
					logI("Failed to launch demo " + DemoActivities.values()[position]);
					e.printStackTrace();
				}
			}
    	}
    }
}