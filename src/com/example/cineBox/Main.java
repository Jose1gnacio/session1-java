package com.example.cineBox;
import java.util.Scanner;

import com.example.metodosEnClases.Movie4;

public class Main {
    public static void main(String[] args) {
        Movie backToTheFuture = new Movie("Back to the Future", "Ciencia Ficción", 120);
        backToTheFuture.setWonOscar(true);
        backToTheFuture.download();
        System.out.println();

        Series breakingBad = new Series("Breaking Bad", "Drama and Drugs", 50, 11,
                5 );
        Series vikings = new Series("Vikings", "Actions and adventure", 60, 12,
                6 );
        Series friends = new Series("Friends", "Comedy", 700, 14,
                10 );

        breakingBad.setSynopsis("Breaking Bad is a 2016 American drama film based on");
        vikings.setSynopsis("Vikings is a 2017 American dram");
        friends.setSynopsis("Friends is a 2018 American comedy film based on");

        //prints de pruebas
        System.out.println(backToTheFuture.getTitle());
        System.out.println();
        System.out.println(backToTheFuture.toString());
        System.out.println(breakingBad.toString());

        backToTheFuture.play();
        backToTheFuture.pause();
        breakingBad.play();

        System.out.println();

        breakingBad.moveForward();


        //Ejemplos de metodos privados
        Media media = new Media("batman", "Action", 111);
        //String title = media.title
        //String genre = media.genre
        //int duration = media.duration
       // cuando el metodo o variable es public
        String title = media.getTitle();
        String genre = media.getGenre();
        int duration = media.getDuration();
        //cuando el metodo o variable es private

        System.out.println();

        media.moveForward(11);

        System.out.println();
        System.out.println();

        System.out.println(backToTheFuture.getDuration());
        System.out.println(breakingBad.getDuration());

        printInstructions();

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
            printInstructions();
            selection = scanner2.nextInt();
        }
        System.out.println("Fin");
    }

    private static void printInstructions() {
        System.out.println("Seleciona una serie para ver su sinopsis");
        System.out.println("1) - Breaking Bad");
        System.out.println("2) - Viking");
        System.out.println("3) - Friends");
        System.out.println("0) - Salir");
    }
}
