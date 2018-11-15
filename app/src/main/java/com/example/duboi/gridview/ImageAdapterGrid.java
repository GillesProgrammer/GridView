package com.example.duboi.gridview;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapterGrid extends BaseAdapter {
    Context context;
    List<Integer> imagesId;
    public ImageAdapterGrid(Context context, List<Integer> imagesId){
        this.context = context;
        this.imagesId = imagesId;
    }

    @Override
    public int getCount() {
        return imagesId.size();
    }

    @Override
    public Object getItem(int position) {
        return imagesId.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("test","get View: "+ position);
        ImageView imageView = null;
        if(convertView == null) {
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else
        {
            imageView = (ImageView)convertView;
        }
        imageView.setImageResource((int)getItem(position));
        return imageView;
    }
}
