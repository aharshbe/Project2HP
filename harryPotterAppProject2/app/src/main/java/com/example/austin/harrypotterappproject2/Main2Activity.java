package com.example.austin.harrypotterappproject2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    //Creates an OnClick event for intent on the movies textView

    public void whenClickedmovie1(View view) {
        Toast.makeText(getApplicationContext(), "clicked HP Movie 1", Toast.LENGTH_SHORT).show();
    }
}
