package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_three);
    }

    //Creates intent for user so they can go back to movies screen

    public void back(View view) {
        Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
        startActivity(intent);
    }
}
