package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Creates an OnClick event for intent on the movies textView


    public void whenClickedMovies(View view) {
        Toast.makeText(getApplicationContext(), "clicked HP Movies", Toast.LENGTH_SHORT).show();

//        Intent intent = new Intent(MainActivity.this, A2.class);
//        startActivity(intent);

    }

    //Creates an OnClick event for intent on the books textView

    public void whenClickedBooks(View view) {
        Toast.makeText(getApplicationContext(), "clicked HP Books", Toast.LENGTH_SHORT).show();
    }

    //Creates an OnClick event for intent on the quotes textView

    public void whenClickedQuotes(View view) {
        Toast.makeText(getApplicationContext(), "clicked HP Quotes", Toast.LENGTH_SHORT).show();
    }
}
