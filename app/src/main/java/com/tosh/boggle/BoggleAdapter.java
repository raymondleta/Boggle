package com.tosh.boggle;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BoggleAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mBoggleLetters;
    private Typeface mTypeface;

    @Override
    public int getCount() {
        return mBoggleLetters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(convertView == null){
            gridView = inflater.inflate(R.layout.boggle_grid_item, null);
            TextView boggleView = (TextView) gridView
                    .findViewById(R.id.grid_item_number);
            boggleView.setText(mBoggleLetters[position]);
            boggleView.setTypeface(mTypeface);
        }else{
            gridView = (View) convertView;
        }
        return gridView;

    }

    public BoggleAdapter(Context mContext, String[] mBoggleLetters, Typeface typeface) {
        this.mContext = mContext;
        this.mBoggleLetters = mBoggleLetters;
        this.mTypeface = typeface;
    }
}
