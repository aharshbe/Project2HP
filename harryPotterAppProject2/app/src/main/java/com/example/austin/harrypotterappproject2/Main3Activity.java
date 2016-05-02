package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    //References all the textView which will pull that data from the database for each movie
    TextView plot = (TextView) findViewById(R.id.plotlistview);
    TextView date = (TextView) findViewById(R.id.datelistView);
    TextView runtime = (TextView) findViewById(R.id.runtimelistView);
    TextView topquote = (TextView) findViewById(R.id.topquotelistView);
    TextView gross = (TextView) findViewById(R.id.grosslistView);



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

    //Creates constructor for textViews which represent each of the values in the database for the descirption of the movies
    public Main3Activity(TextView plot, TextView date, TextView runtime, TextView topquote, TextView gross) {
        this.plot = plot;
        this.date = date;
        this.runtime = runtime;
        this.topquote = topquote;
        this.gross = gross;
    }
}


