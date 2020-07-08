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
        Songs.add(new Song("Love Me Like You Do",  " Ellie Goulding",R.drawable.english_song1));
        Songs.add(new Song("See You Again",  " Wiz Khalifa",R.drawable.en));
        Songs.add(new Song("Perfect",  " Ed Sheeran",R.drawable.english_song3));
        Songs.add(new Song("Shape of You",  " Ed Sheeran",R.drawable.english_song4));
        Songs.add(new Song("I Got You",  " Bebe Rexha",R.drawable.english_song5));
        Songs.add(new Song("Sorry",  " Justin Bieb",R.drawable.english_song6));
        Songs.add(new Song("Thinking Out Loud",  "  Ed Sheeran",R.drawable.english_song7));
        Songs.add(new Song("Let Me Love You",  "DJ Snake",R.drawable.english_song8));
        Songs.add(new Song("Closer",  " The Chainsmokers",R.drawable.english_song9));
        Songs.add(new Song("Girls like You",  "Maroon",R.drawable.images));





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