package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
    }

    public void whenbooksclicked(View view) {
        Toast.makeText(getApplicationContext(), "clicked books title", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(BooksActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void opendescription1(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription.class);
        startActivity(intent);

    }

    public void opendescription2(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription2.class);
        startActivity(intent);
    }
}
