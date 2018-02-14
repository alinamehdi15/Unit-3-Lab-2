package com.example.entec01.myapplication;

/**
 * Created by Entec01 on 2/7/2018.
 */

public class ArtPiece {
    //data fields
    private String name;
    private String artist;
    private int year;

    public ArtPiece(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ArtPiece{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }
}
