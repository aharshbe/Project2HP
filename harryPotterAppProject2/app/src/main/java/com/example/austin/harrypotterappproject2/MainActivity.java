package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Creates an OnClick event for intent on the movies textView


    public void whenClickedMovies(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }

    //Creates an OnClick event for intent on the books textView

    public void whenClickedBooks(View view) {
        Intent intent = new Intent(MainActivity.this, BooksActivity.class);
        startActivity(intent);
    }

    //Creates an OnClick event for intent on the quotes textView

    public void whenClickedQuotes(View view) {
        Intent intent = new Intent(MainActivity.this, QuotesActivity.class);
        startActivity(intent);
    }

    //Creates a little easterEgg when clicked

    public void whenHPClicked(View view) {
        Toast.makeText(getApplicationContext(), "You found the easteregg!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, easteregg.class);
        startActivity(intent);

    }
}
