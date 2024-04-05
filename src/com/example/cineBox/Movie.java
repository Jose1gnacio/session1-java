package com.example.cineBox;

public class Movie extends Media {
    private boolean wonOscar;

    public Movie(String title, String genre, int duration) {
        super(title, genre, duration);//super hace referencia que esta llamando al contructor de media


    }

    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
}
