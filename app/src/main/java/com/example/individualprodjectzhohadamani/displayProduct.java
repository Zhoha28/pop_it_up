package com.example.individualprodjectzhohadamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class displayProduct extends AppCompatActivity {
    TextView product_name;
    ImageView productImageView;
    TextView product_details;
    Button buyNowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product);
        Intent intent;
        intent = new Intent(this, checkOutForm.class);


        Bundle extras = getIntent().getExtras();
        String productName= extras.getString("productName");
        int productImage= extras.getInt("productImage");
        String productDescription= extras.getString("productDescription");

        // globally

        TextView product_name = (TextView)findViewById(R.id.productName);
        ImageView productImageView = (ImageView)findViewById(R.id.productImageView);
        TextView productDetails = (TextView)findViewById(R.id.productDetails);
        Button buyNowButton = (Button)findViewById(R.id.buyNow);

        //in your OnCreate() method
        product_name.setText(productName);
        Log.i("TAG", String.valueOf(productName));

        productImageView.setImageResource(productImage);
        productDetails.setText(productDescription);



        buyNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("productNameCheckout",productName );
                startActivity(intent);

            }
        });




    }

}