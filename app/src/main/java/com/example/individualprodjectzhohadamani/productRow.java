package com.example.individualprodjectzhohadamani;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class productRow extends ArrayAdapter {
    private String[] productName;
    private String[] productPrice;
    private Integer[] imageid;
    private Activity context;

    public productRow(Activity context, String[] productName, Integer[] imageid, String[] productPrice) {
        super(context, R.layout.row_item, productName);
        this.context = context;
        this.productName = productName;
        this.imageid = imageid;
        this.productPrice = productPrice;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;




        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewCountry = (TextView) row.findViewById(R.id.textProductName);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.productImageView);

        textViewCountry.setText(productName[position]);
        imageFlag.setImageResource(imageid[position]);

        row.setBackgroundColor(Color.rgb(245,245,245));
        return  row;

    }
}
 