package com.example.gettersSetters;

public class Movie {
    String title;
    String genre;
    int duration;

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
