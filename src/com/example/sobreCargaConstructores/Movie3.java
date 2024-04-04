package com.example.sobreCargaConstructores;

public class Movie3 {
    String title;
    String genre;
    int duration;

    public Movie3(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public Movie3(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public Movie3() {
        this.title = "No title";
        this.genre = "No genre";
        this.duration = 0;
    }

    public String getTitle() {
        return "this is the movie " + title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
