package com.xtrafe.mobile.fma;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

public abstract class ActBase extends Activity {
	
	protected ActBase() {
		logI(this.toString() + " born.");
	}
	
	protected void logI (String message) {
		MyLog.logI(message);
	}
	
	protected Dialog getAlertDialog(String title, DialogInterface.OnClickListener onClickYes) {
		final AlertDialog alertDialog = new AlertDialog.Builder(this).create();		
		alertDialog.setTitle(title);		
		alertDialog.setMessage(getResources().getString(R.string.textAreYouSure));    				
		alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, getResources().getString(R.string.labelYes), onClickYes);		
		alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, getResources().getString(R.string.labelNo), new DialogInterface.OnClickListener() {
 		   public void onClick(DialogInterface dialog, int which) {
 			   alertDialog.cancel();
 		   }
 		});
		return alertDialog;
	}
	
	public String getStringResource(String resName){
		try {    				
			return getResources().getString(R.string.class.getField(resName).getInt(null));
		}
		catch (Exception e){
			logI("Could not find resource '" + resName + "'");
			e.printStackTrace();
		}
		return null;
	}
}
