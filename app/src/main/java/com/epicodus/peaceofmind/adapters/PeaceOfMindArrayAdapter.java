package com.epicodus.peaceofmind;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by colinjbloom on 6/3/17.
 */

public class PeaceOfMindArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mLocations;
    private String[] mDangerLevels;

    public PeaceOfMindArrayAdapter(Context mContext, int resource, String[] mLocations, String[] mDangerLevels){
        super(mContext, resource);
        this.mContext = mContext;
        this.mDangerLevels = mDangerLevels;
        this.mLocations = mLocations;
    }

    @Override
    public Object getItem(int position) {
        String location = mLocations[position];
        String dangerLevel = mDangerLevels[position];
        return String.format("%s \nDanger level: %s", location, dangerLevel);
    }
    @Override
    public int getCount() {
        return mLocations.length;
    }

}
