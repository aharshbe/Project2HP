package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
    }

    //Adds intent over to main acitivty from quotes


    public void clickingquotes(View view) {
        Intent intent = new Intent(QuotesActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
