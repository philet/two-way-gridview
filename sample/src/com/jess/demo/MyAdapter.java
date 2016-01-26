package com.jess.demo;

import com.jess.ui.TwoWayAbsListView.LayoutParams;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	
	Context mContext;

	public MyAdapter(Context context) {
		super();
		mContext = context;
	}

	@Override
	public int getCount() {
		return 20;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//View v = new View(mContext);
		//v.setLayoutParams(new LayoutParams(150, 150));
		//v.setBackgroundColor(Color.BLUE);
		TextView tv = new TextView(mContext);
		tv.setLayoutParams(new LayoutParams(150, 150));
		tv.setText(position + " ");
		tv.setBackgroundColor(Color.BLUE);
		return tv;
	}

}
