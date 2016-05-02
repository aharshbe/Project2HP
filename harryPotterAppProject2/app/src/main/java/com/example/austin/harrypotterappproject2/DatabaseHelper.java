package com.example.austin.harrypotterappproject2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.Blob;

/**
 * Created by austin on 5/2/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    // Define the database name and version
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Movies.db";

    //Creates databases
    public static final String SQL_CREATE_MOVIE_TABLE =
            "CREATE TABLE movies ( id INTEGER PRIMARY KEY, movie TEXT, cover BLOB )";
    public static final String SQL_CREATE_MOVIEDESCRIPTION_TABLE =
            "CREATE TABLE movies ( id INTEGER PRIMARY KEY, plot TEXT, date TEXT, runtime TEXT, topquote TEXT, gross TEXT )";
    //Delete databases
    public static final String SQL_DROP_MOVIE_TABLE = "DROP TABLE IF EXISTS movies";
    public static final String SQL_DROP_MOVIEDESCRIPTION_TABLE = "DROP TABLE IF EXISTS moviesdescirption";


    // override the SQLiteDatabase's constructor, onCreate, and onUpgrade
    public DatabaseHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Creates the movies table when the data is created
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_MOVIE_TABLE);
        db.execSQL(SQL_CREATE_MOVIEDESCRIPTION_TABLE);
    }

    //Updates when data us upgraded and then deletes the movies table and recreates it
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_MOVIE_TABLE);
        db.execSQL(SQL_DROP_MOVIEDESCRIPTION_TABLE);
        onCreate(db);
    }

    public void insertmovies(int id, String movie, Blob cover){
        // Get a reference to the database
        SQLiteDatabase db = getWritableDatabase();

        // create a new content value to store values
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("movie", movie);
        values.put("cover", String.valueOf(cover));

        // Insert the row into the movies table
        db.insert("movies", null, values);
    }

    public void insertdescription(int id, String plot, String date, String runtime, String topquote, String gross){
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
        db.insert("moviesdescirption", null, values);
    }


    public Main2Activity getnameCovers(int id){
        // Get a reference to the database
        SQLiteDatabase db = getReadableDatabase();

        // Define a projection, which tells the query to return only the columns mentioned
        // similar to "SELECT column1, column2, column3"
        String[] projection = new String[]{ "id", "movie", "cover" };

        // Define a selection, which defines the WHERE clause of the query (but not the values for it)
        // similar to "WHERE x < 23", only without the value; "WHERE x < ?"
        String selection = "id = ?";

        // Define the selection values. The ?'s in the selection
        // The number of values in the following array should equal the number of ? in the where clause
        String[] selectionArgs = new String[]{ String.valueOf(id) };

        // Make the query, getting the cursor object
        Cursor cursor = db.query("movies", projection, selection, selectionArgs, null, null, null, null);

        // With the cursor, create a new movie object and return it
        cursor.moveToFirst();

        String movie1 = cursor.getString( cursor.getColumnIndex("movie") );
        String movie2 = cursor.getString( cursor.getColumnIndex("movie") );
        String movie3 = cursor.getString( cursor.getColumnIndex("movie") );
        String movie1cover = cursor.getString( cursor.getColumnIndex("cover") );
        String movie2cover = cursor.getString( cursor.getColumnIndex("cover") );
        String movie3cover = cursor.getString( cursor.getColumnIndex("cover") );


        return new Main2Activity(id, movie1,movie2, movie3, movie1cover, movie2cover, movie3cover);
    }
}



}