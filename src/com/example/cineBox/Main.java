package com.example.cineBox;

import com.example.metodosEnClases.Movie4;

public class Main {
    public static void main(String[] args) {
        Movie backToTheFuture = new Movie("Back to the Future", "Ciencia Ficción", 120);
        backToTheFuture.setTitle("Back to the Future");
        backToTheFuture.setGenre("Ciencia Ficción");
        backToTheFuture.setWonOscar(true);

        Series breakingBad = new Series();
        breakingBad.setTitle("Breaking Bad");
        breakingBad.setGenre("Drama and Drugs");
        breakingBad.setEpisodeDuration(50);
        breakingBad.setTotalEpisodes(12);
        breakingBad.setTotalSeasons(5);

        System.out.println(backToTheFuture.getTitle());
        System.out.println();
        System.out.println(backToTheFuture.toString());
        System.out.println(breakingBad.toString());

        backToTheFuture.play();
        backToTheFuture.pause();

        breakingBad.play();

        System.out.println();

        breakingBad.moveForward();

        Media media = new Media("batman", "Action", 111);

        //String title = media.title
        //String genre = media.genre
        //int duration = media.duration
       // cuando el metodo o variable es public

        //cuando el metodo o variable es private
        String title = media.getTitle();
        String genre = media.getGenre();
        int duration = media.getDuration();

        System.out.println();

        media.moveForward(11);

    }
}
