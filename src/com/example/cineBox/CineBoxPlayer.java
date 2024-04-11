package com.example.cineBox;

import java.util.Scanner;
import java.util.ArrayList;

public class CineBoxPlayer implements MediaDownloader.DownLoadListener {

    public void initialize() {
        Movie backToTheFuture = new Movie("Back to the Future", "Ciencia Ficción", 120);
        backToTheFuture.setWonOscar(true);

        MediaDownloader.download(backToTheFuture, this);

        Movie avengers = new Movie("Avengers", "Action", 130);
        Movie Avatar = new Movie("Back to the Future", "Ficción", 140);

        backToTheFuture.setSynopsis("Back to the Future is a 2016 American drama film based on");
        avengers.setSynopsis("Avengers is a 2012 American action film based on");
        Avatar.setSynopsis("Avatar is a 2014 film based on");

        Series breakingBad = new Series("Breaking Bad", "Drama and Drugs", 50, 11,
                5 );
        Series vikings = new Series("Vikings", "Actions and adventure", 60, 12,
                6 );
        Series friends = new Series("Friends", "Comedy", 700, 14,
                10 );

        breakingBad.setSynopsis("Breaking Bad is a 2016 American drama film based on");
        vikings.setSynopsis("Vikings is a 2017 American dram");
        friends.setSynopsis("Friends is a 2018 American comedy film based on");

        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(backToTheFuture);
        mediaList.add(avengers);
        mediaList.add(Avatar);
        mediaList.add(breakingBad);
        mediaList.add(vikings);
        mediaList.add(friends);

        printInstructions(mediaList);

        Scanner scanner2 = new Scanner(System.in);
        int selection = scanner2.nextInt();


        while (selection != 0) {
            System.out.println("\n");

            if (selection == 1) {
                System.out.println(breakingBad.getSynopsis());
            } else if (selection == 2) {
                System.out.println(vikings.getSynopsis());
            } else if (selection == 3) {
                System.out.println(friends.getSynopsis());
            } else {
                System.out.println("Serie invalida");
            }

            System.out.println("\n");
            printInstructions(mediaList);
            selection = scanner2.nextInt();
        }
        System.out.println("Fin");

    }
    private static void printInstructions(ArrayList<Media> mediaList) {
        System.out.println("Seleciona una serie para ver su sinopsis");

        Media backToTheFuture = mediaList.get(0);
        Media avengers = mediaList.get(1);
        Media Avatar = mediaList.get(2);
        Media breakingBad = mediaList.get(3);
        Media vikings = mediaList.get(4);
        Media friends = mediaList.get(5);

        System.out.println("1) - " + backToTheFuture.getTitle());
        System.out.println("2) - " + avengers.getTitle());
        System.out.println("3) - " + Avatar.getTitle());
        System.out.println("4) - " + breakingBad.getTitle());
        System.out.println("5) - " + vikings.getTitle());
        System.out.println("6) - " + friends.getTitle());
        System.out.println("0) - Salir");
    }

    @Override
    public void onMediaDownloaded(Media media, String content) {
        media.setContent(content);
        media.play();
        System.out.println(content);

    }
}

/*
         backToTheFuture.setWonOscar(true);
        MediaDownloader.download(backToTheFuture.getTitle(), this);
        System.out.println();

        //prints de pruebas
        System.out.println(backToTheFuture.getTitle());
        System.out.println();
        System.out.println(backToTheFuture.toString());
        System.out.println(breakingBad.toString())

        backToTheFuture.play();
        backToTheFuture.pause();
        breakingBad.play();

        System.out.println();

        breakingBad.moveForward();


        //Ejemplos de metodos privados
        //Media media = new Media("batman", "Action", 111);
        //String title = media.title
        //String genre = media.genre
        //int duration = media.duration
        // cuando el metodo o variable es public
        //String title = media.getTitle();
       // String genre = media.getGenre();
        //int duration = media.getDuration();
        //cuando el metodo o variable es private

        System.out.println();

        //media.moveForward(11);

        System.out.println();
        System.out.println();

        System.out.println(backToTheFuture.getDuration());
        System.out.println(breakingBad.getDuration());
         */
