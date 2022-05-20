package com.example.individualprodjectzhohadamani;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import android.app.ListActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class shop extends AppCompatActivity {

    private GridView listView;
    private String productName[] = {
            "Hulk T-shirt",
            "Batman Begins T-shirt",
            "Rick and Morty T-shirt",
            "Superman T-shirt",
            "Captain Marvel T-shirt",
            "Baby Groot T-shirt"

    };



    private Integer imageid[] = {
            R.drawable.hulktshirt,
            R.drawable.batmanb,
            R.drawable.rick,
            R.drawable.superman_ccexpress,
            R.drawable.captainmarvel,
            R.drawable.groot_ccexpress
    };

    private String productDescription[] = {
            "The standard, traditional t-shirt for everyday wear\n" +
                    "Classic, generous, boxy fit",
            "The standard, traditional t-shirt for everyday wear\n" +
                    "Classic, generous, boxy fit",
            "The standard, traditional t-shirt for everyday wear\n" +
                    "Classic, generous, boxy fit",
            "The standard, traditional t-shirt for everyday wear\n" +
                    "Classic, generous, boxy fit",
            "The standard, traditional t-shirt for everyday wear\n" +
                    "Classic, generous, boxy fit",
            "The standard, traditional t-shirt for everyday wear\n" +
                    "Classic, generous, boxy fit"
    };

    private String productPrice[] = {
            "$ 29.99",
            "$ 39.99",
            "$ 19.99",
            "$ 20.99",
            "$ 29.96",
            "$ 29.91",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);


        Intent intent = new Intent(shop.this,displayProduct.class);



        // Setting header
        TextView textView = new TextView(this);


        GridView listView=(GridView)findViewById(android.R.id.list);


        // For populating list data
        productRow customProductList = new productRow(this, productName, imageid, productPrice);
        listView.setAdapter(customProductList);





        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {



                intent.putExtra("productName", productName[position]);

                intent.putExtra("productImage", imageid[position]);
                intent.putExtra("productDescription", productDescription[position]);
                intent.putExtra("productPrice", productPrice[position]);
                startActivity(intent);

            }
        });
    }
}

