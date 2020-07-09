package com.example.android.musicstructuralapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_songs);

        //Create arrayList
        ArrayList<Song> Songs = new ArrayList<Song>();


        //list of songs
        Songs.add(new Song("Tujhe Kitna Chahne Lage",  " Arijit Singh",R.drawable.hindi1));
        Songs.add(new Song("Pal",  " Arijit Singh",R.drawable.hindi2));
        Songs.add(new Song("Duniya",  "Akhil & Dhavani",R.drawable.hindi3));
        Songs.add(new Song(" Main Rahoon Ya Na Rahoon",  "Armaan Malik",R.drawable.hindi4));
        Songs.add(new Song(" Main Tera Ho Gaya",  "  Millind Gaba",R.drawable.hindi5));
        Songs.add(new Song("Kahin To hogi Woh",  "A.R. Rahman",R.drawable.hindi6));
        Songs.add(new Song("Bekhayali",  " Arijit Singh",R.drawable.hindi7));
        Songs.add(new Song("Phir Bhi Tumko Chaahunga",  "Arijit Singh",R.drawable.hindi8));
        Songs.add(new Song("Tu Dua hai ",  "Darsan Raval",R.drawable.hindi9));
        Songs.add(new Song("Darasal",  "Atif Aslam",R.drawable.hindi10));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, Songs, R.color.category_songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}