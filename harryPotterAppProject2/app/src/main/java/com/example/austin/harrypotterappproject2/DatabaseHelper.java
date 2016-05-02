package com.example.austin.harrypotterappproject2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by austin on 5/2/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    // Define the database name and version
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Movies.db";

    //Creates database
    public static final String SQL_CREATE_MOVIE_TABLE =
            "CREATE TABLE movies ( id INTEGER PRIMARY KEY, plot TEXT, date TEXT, runtime TEXT, topquote TEXT, gross TEXT )";
    //Delete database
    public static final String SQL_DROP_MOVIE_TABLE = "DROP TABLE IF EXISTS movies";




    // override the SQLiteDatabase's constructor, onCreate, and onUpgrade
    public DatabaseHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Creates the movies table when the data is created
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_MOVIE_TABLE);
    }

    //Updates when data us upgraded and then deletes the movies table and recreates it
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_MOVIE_TABLE);
        onCreate(db);
    }

    public void insert(int id, String plot, String date, String runtime, String topquote, String gross){
        // Get a reference to the database
        SQLiteDatabase db = getWritableDatabase();

        // create a new content value to store values
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("plot", plot);
        values.put("date", date);
        values.put("runtime", runtime);
        values.put("topquote", topquote);
        values.put("gross", gross);

        // Insert the row into the movies table
        db.insert("movies", null, values);
    }
}