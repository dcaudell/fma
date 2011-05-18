package com.xtrafe.mobile.fma;

import android.util.Log;

public class MyLog {
	public static void logI(String message){
		if (message == null)
			return;
		StringBuffer outBuffer = new StringBuffer();
		outBuffer.append(new Exception().getStackTrace()[1]);
		outBuffer.append(": ");
		outBuffer.append(message);
		Log.i(StatGlob.appTag, outBuffer.toString());
	}
}
