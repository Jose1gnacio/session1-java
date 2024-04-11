package com.example.cineBox;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;

public class CineBoxPlayer implements MediaDownloader.DownLoadListener {

    public void initialize() {
        Movie backToTheFuture = new Movie("Back to the Future", "Ciencia Ficción", 120);
        Movie avengers = new Movie("Avengers", "Action", 120);
        Movie Avatar = new Movie("Avatar", "Ficción", 140);

        backToTheFuture.setSynopsis("Back to the Future is a 2016 American drama film based on");
        avengers.setSynopsis("Avengers is a 2012 American action film based on");
        Avatar.setSynopsis("Avatar is a 2014 film based on");

        MediaDownloader.download(backToTheFuture, this);

        Series breakingBad = new Series("Breaking Bad", "Drama and Drugs", 50, 11,
                5 );
        Series vikings = new Series("Vikings", "Actions and adventure", 60, 12,
                6 );
        Series friends = new Series("Friends", "Comedy", 700, 14,
                10 );

        breakingBad.setSynopsis("Breaking Bad is a 2016 American drama film based on");
        vikings.setSynopsis("Vikings is a 2017 American dram");
        friends.setSynopsis("Friends is a 2018 American comedy film based on");

        PriorityQueue<Media> mediaQueue = new PriorityQueue<>();
        mediaQueue.add(backToTheFuture);
        mediaQueue.add(avengers);
        mediaQueue.add(Avatar);
        mediaQueue.add(breakingBad);
        mediaQueue.add(vikings);
        mediaQueue.add(friends);

        //playQueue(mediaQueue);

        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(backToTheFuture);
        mediaList.add(avengers);
        mediaList.add(Avatar);
        mediaList.add(breakingBad);
        mediaList.add(vikings);
        mediaList.add(friends);

        Collections.sort(mediaList);//para ordenar alfabeticamente

        printInstructions(mediaList);

        Scanner scanner2 = new Scanner(System.in);
        int selection = scanner2.nextInt();

        while (selection != 0) {
            System.out.println("\n");
            int mediaListSIze = mediaList.size();
            int index = selection -1;
            if (index >= mediaListSIze){
                System.out.println("Serie invalida, seleciona otra");
            } else {
                Media media = mediaList.get(index);
                System.out.println(media.getSynopsis());
            }
            System.out.println("\n");
            printInstructions(mediaList);
            selection = scanner2.nextInt();
        }
        System.out.println("Fin");
    }
    private void playQueue (PriorityQueue<Media> mediaQueue) {
        while (mediaQueue.size() > 0) {
            Media media = mediaQueue.poll();
            media.play();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private static void printInstructions(ArrayList<Media> mediaList) {
        System.out.println("Seleciona una serie para ver su sinopsis");
        for (int i = 0; i< mediaList.size(); i++ ) {
            Media media = mediaList.get(i);
            int index = i + 1;
            System.out.println(index + ") - " + media.getTitle());
        }
        //otra forma de recorrer la arrayList, de esta forma se muestra pero no se muestra el indice
        //el cual necesitamos para poder indicar a que numero corresponde
        //for (Media media : mediaList){
        //    System.out.println(media.getTitle());
        //}
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
