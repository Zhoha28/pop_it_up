package com.example.individualprodjectzhohadamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class thankyoupage extends AppCompatActivity {
    TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyoupage);
        email = (TextView)findViewById(R.id.emailaddress);


        Bundle extras = getIntent().getExtras();
        String emailad= extras.getString("emailaddress");


// Now set this value to EditText
        email.setText(emailad);

    }
}