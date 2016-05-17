package com.appsriv.holbe;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by appsriv-02 on 17/5/16.
 */
public class CustomListDrawer extends BaseAdapter{
    private String[] names;
    private String[] desc;
    private Integer[] imageid;
    private Activity context;
    String colour;

    public CustomListDrawer(Activity context, String[] names, Integer[] imageid ,String colour)
    {
        this.context = context;
        this.names = names;
        this.imageid = imageid;
        this.colour = colour;

    }

    @Override
    public int getCount() {
        return names.length;
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
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.dummy, null, true);
        ImageView icon = (ImageView) listViewItem.findViewById(R.id.icon);
        TextView type = (TextView) listViewItem.findViewById(R.id.type);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);
        icon.setBackgroundResource(imageid[position]);
        type.setText(names[position]);

        return  listViewItem;
    }
}