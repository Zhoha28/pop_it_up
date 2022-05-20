package com.example.individualprodjectzhohadamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homePage extends AppCompatActivity {
    // grab the about us title textview
    TextView aboutTitle;
    Button shopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        // grab textview for about us title from homepage activity
        aboutTitle = (TextView)findViewById(R.id.thankyouTitle);

        shopButton = (Button) findViewById(R.id.shopCtaButton);

        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListShop();
            }
        });
        // text one for about us title
        String aboutOne = getColoredSpanned("ABOUT", "#FFFFFF");

        // text one i.e. company name for about us title
        String companyTitle = getColoredSpanned("POPITUP","#E95595");

        aboutTitle.setText(Html.fromHtml(aboutOne+" "+companyTitle));

    }

    public void openListShop(){
        Intent intent = new Intent(this,
                shop.class);
        startActivity(intent);
    }

//    function to add multi color in one textview
    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }


}