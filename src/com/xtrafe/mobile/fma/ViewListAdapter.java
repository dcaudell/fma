package com.xtrafe.mobile.fma;

import java.util.ArrayList;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;


public class ViewListAdapter 
	extends BaseAdapter 
	implements ListAdapter {
	
	private ArrayList<View> views = new ArrayList<View>();

	public void add(View view){								
		views.add(view);					
	}

	public int getCount() {
		return views.size();
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}	

	public View getView(int position, View convertView, ViewGroup parent) {
		return views.get(position);
	}		
}

