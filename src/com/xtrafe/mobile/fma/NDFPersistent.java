package com.xtrafe.mobile.fma;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import android.content.Context;

public abstract class NDFPersistent
	implements Serializable {
	
	protected abstract String getFilename();
	
	public static <T> T load(String filename, Context context, Class<? extends T> prototype){
		FileInputStream fis = null;
		T ret = null;		
		try {
			File target = new File(context.getFilesDir(), filename);			
			MyLog.logI("Trying to load file " + filename + " " + target.length() + " bytes.");								
			
			fis = context.openFileInput(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();			
			
			if (prototype.isInstance(obj))				
				ret = prototype.cast(obj);
		}
		catch (Exception ioe){
			ioe.printStackTrace();
		}
		finally {
			try {
				if (fis != null)
					fis.close();
			}
			catch (Exception e){
				//Do nothing.
			}
		}
		if (ret != null)
			MyLog.logI("Loading Succeeded.");
		else
			MyLog.logI("Loading Failed.");
		return ret;
	}
	
	public void persist(Context context){
		OutputStream outputStream = null;
		ObjectOutputStream oos = null;
		MyLog.logI("Trying to save file " + getFilename());
		try {
			String backupFilename = getFilename() + context.getResources().getString(R.string.extBackupExtension);
			
			File dir = context.getFilesDir();
			File currentVersion = new File(dir, getFilename());
			File backupVersion = new File(dir, backupFilename);							
				
			if (backupVersion.exists())			
				backupVersion.delete();		
			if (currentVersion.exists()) 
				currentVersion.renameTo(backupVersion);
			
			currentVersion.createNewFile();

			outputStream = context.openFileOutput(getFilename(), Context.MODE_PRIVATE);
			oos = new ObjectOutputStream(outputStream);
			oos.writeObject(this);
			oos.flush();
			oos.close();			
			MyLog.logI("Saving succeeded. " + currentVersion.length() + " bytes.");
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				if (oos != null)
					oos.close();
				else if (outputStream != null)
					outputStream.close();
			}
			catch (Exception e){
				//Do nothing.
			}
		}
	}	
}
