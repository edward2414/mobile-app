package com.hs2069.hs2069.Adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hs2069.hs2069.PersonActivity;
import com.hs2069.hs2069.R;

import java.util.ArrayList;

/**
 * Created by edward2414 on 7/9/2016.
 */
public class PersonInfoAdapter1 extends BaseAdapter {
    private ArrayList<String> mData;

    public PersonInfoAdapter1(ArrayList<String> mData) {
        super();
        this.mData = mData;
    }

    @Override
    public int getCount(){
        return mData.size();
    }

    @Override
    public Object getItem(int position){
        return mData.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_person_info1, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.tv = (TextView)convertView.findViewById(R.id.list_person_info1_tv);
            convertView.setTag(viewHolder);
        }
        ViewHolder holder = (ViewHolder)convertView.getTag();
        holder.tv.setText(mData.get(position));
        return convertView;
    }

    private static class ViewHolder{
        public TextView tv;
    }
}