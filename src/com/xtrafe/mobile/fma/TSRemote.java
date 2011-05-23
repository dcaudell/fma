package com.xtrafe.mobile.fma;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

import com.google.gson.Gson;

//Much of this code boosted from http://hifly81.wordpress.com/2010/12/15/java-to-android-marshallunmarshall-java-objects/
public class TSRemote {

	public static <T> T getRemoteObject(URI uri, HttpParams params, Class<T> prototype) {
		
		Gson gson = new Gson();
		Reader reader = new InputStreamReader(getHTTPDataStream(uri, params));		
		return gson.fromJson(reader, prototype);		
	}	
	
	public static InputStream getHTTPDataStream(URI uri, HttpParams params){
		DefaultHttpClient httpClient = new DefaultHttpClient();		
		InputStream data = null;
		try {			
			HttpGet method = new HttpGet(uri);
			if (params != null)
				method.setParams(params);
			MyLog.logI("Sending JSON request to " + method.getURI());
			HttpResponse response = httpClient.execute(method);			
			data = response.getEntity().getContent();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}		
		return data;
	}
}
