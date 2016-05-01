package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    //Intents over to first activity as a back button

    public void clickingOnBook(View view) {
        Intent intent = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(intent);
    }

    //Will intent over to the acitivty that contains description

    public void clickOnfirstBook(View view) {
        Intent intent = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
