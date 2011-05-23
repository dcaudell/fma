package com.xtrafe.mobile.fma;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;

public abstract class TSLoadingTask {
	
	private Activity activity;
	private String title = "Loading...";
	private String message = "";
	
	private boolean running = false;
	
	//Happens on windowing thread before dialog is displayed
	public void pre() {}
	//Happens on async thread after dialog is displayed
	public void run() {}
	//Happens on windowing thread just before dialog is dismissed
	public void post() {}
	
	public synchronized void execute() {
		if (running)
			return;
		running = true;
		new MyTask().execute((Object[]) null);
	}
	
	public TSLoadingTask(Activity activity){
		this.activity = activity;
	}
	
	public Activity getActivity(){
		return activity;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setMessage(String message){
		this.message = message;
	}

	private class MyTask extends AsyncTask<Object, Integer, Object> {
		
		private static final int STATE_BEGIN = 0;		
		private static final int STATE_END = 2;		
		private ProgressDialog progressDialog;			
		
		@Override
		protected Object doInBackground(Object... params) {			
			publishProgress(STATE_BEGIN);			
			run();
			publishProgress(STATE_END);
			return null;
		}
		
		protected void onProgressUpdate(Integer... state){			
			switch (state[0]) {
				case STATE_BEGIN:
					pre();
					progressDialog = ProgressDialog.show(activity, title, message, true, false);				
					break;				
				case STATE_END:				
					post();
					progressDialog.dismiss();
					running = false;
					break;
			}							
		}	
	}	
}

