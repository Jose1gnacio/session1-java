package com.example.metodosEnClases;

public class Movie4 {

    static final int FRAME_RESOLUTION = 60;//constante que nunca se pueden cambiar de valor
    static final int SECONDS_IN_A_MINUTE = 60;
    String title;
    String genre;
    int duration;

    public int getTotalFrames() {
        return this.duration * FRAME_RESOLUTION * SECONDS_IN_A_MINUTE;
    }

    public Movie4(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    public Movie4(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public Movie4() {
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

    public void play() { //este es un metodo dentro de la clase Movie4
        System.out.println("Playing movie: " + title);
    };
    public void pause() { //este es un metodo dentro de la clase Movie4
        System.out.println("Playing movie: " + title);
    };



    /*
    Metodo toString
     */
    @Override
    public String toString() {
        return "The movie is: " + title + " and the genre is: " + genre + " and the duration is: " + duration;
    }
}

