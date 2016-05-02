package com.example.austin.harrypotterappproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;



public class Main2Activity extends AppCompatActivity {


    //References the Image and TextViews so that I can set them against the database
    TextView movie1= (TextView) findViewById(R.id.movie1);
    TextView movie2 = (TextView) findViewById(R.id.movie2);
    TextView movie3 = (TextView) findViewById(R.id.movie3);
    ImageView movie1cover = (ImageView) findViewById(R.id.movie1cover);
    ImageView movie2cover = (ImageView) findViewById(R.id.movie2cover);
    ImageView movie3cover = (ImageView) findViewById(R.id.movie3cover);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    //Creates an OnClick event for intent on the description of movie 1 textView

    public void whenClickedmovie1(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    //Creates an OnClick event for intent the description of movie 2 textView

    public void whenClickedmovie2(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    //Creates an OnClick event for intent the description of movie 3 textView

    public void whenClickedmovie3(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    //Creates onClick for movies title to go to previous acitvity

    public void whenClickedTitleMovie(View view) {
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);

    }

    //Creates a contructor for all the textView which represent the movie title (text--TEXT) and movie covers (images--Blobs)
    public Main2Activity(TextView movie1, TextView movie2, TextView movie3, ImageView movie1cover, ImageView movie2cover, ImageView movie3cover) {
        this.movie1 = movie1;
        this.movie2 = movie2;
        this.movie3 = movie3;
        this.movie1cover = movie1cover;
        this.movie2cover = movie2cover;
        this.movie3cover = movie3cover;
    }
}
