package com.example.individualprodjectzhohadamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class checkOutForm extends AppCompatActivity {
    TextView product_name;
    TextView breadcrumbs;
    Button buynowButton;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out_form);
        // grab textview for about us title from homepage activity
        breadcrumbs = (TextView)findViewById(R.id.breadcrumbtext);
       email = (EditText) findViewById(R.id.emailAddress);

        buynowButton = (Button) findViewById(R.id.shopCtaButton);

        buynowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThankYouPage();
            }
        });

        String aboutOne = getColoredSpanned("PRODUCT /", "#DADADA");

        // text one i.e. company name for about us title
        String companyTitle = getColoredSpanned("CART","#E95595");

        breadcrumbs.setText(Html.fromHtml(aboutOne+" "+companyTitle));

        TextView product_name = (TextView)findViewById(R.id.productNameCheckout);

        Bundle extras = getIntent().getExtras();
        String productName= extras.getString("productNameCheckout");

        product_name.setText("BUY " + productName);



    }

    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }
    public void openThankYouPage(){
        Intent intent = new Intent(this,
                thankyoupage.class);
        intent.putExtra ( "emailaddress", email.getText().toString() );
        startActivity(intent);
        startActivity(intent);

    }
}