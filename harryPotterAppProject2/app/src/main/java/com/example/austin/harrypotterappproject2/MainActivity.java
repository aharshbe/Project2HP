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

    public void whenClickedMovies(View view) {
        Toast.makeText(getApplicationContext(), "clicked HP Movies", Toast.LENGTH_LONG).show();

//        Intent intent = new Intent(MainActivity.this, A2.class);
//        startActivity(intent);

    }
}
