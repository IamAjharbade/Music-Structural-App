package com.example.android.musicstructuralapp;

public class Song {
    /**
     * list of songs
     */
    private String mSongs;

    /**
     * singer name
     */
    private String mSingerName;

    /** image banner */
    private int mImageResourceId;

    /**
     * /**
     * Create a new Word object.
     *
     * @param songs      is the word in a language that the user is already familiar with
     *                   (such as English)
     * @param singerName is the word in the Miwok language
     */
    public Song(String songs, String singerName , int imageResourceId) {
        mSongs = songs;
        mSingerName = singerName;
        mImageResourceId = imageResourceId;


        /**
         * Return the image resource ID of the word.
         */
        // public int getImageResourceId() {
        //   return mImageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getSongs() {
        return mSongs;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getSingerName() {
        return mSingerName;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }
}


