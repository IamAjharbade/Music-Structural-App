package com.example.android.musicstructuralapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView English = (ImageView) findViewById(R.id.imageButton);

        // Set a click listener on that View
        English.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, EnglishSongs.class);
                startActivity(familyIntent);
            }
        });


        ImageView hindi = (ImageView) findViewById(R.id.imageButton2);

        // Set a click listener on that View
        hindi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, HindiSongs.class);
                startActivity(familyIntent);
            }
        });
    }
}