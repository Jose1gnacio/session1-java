package com.example.ejemplos;

import java.util.Random;

public class EjemploMetodos {
    public static void main(String[] args) {
        String[] titleArray = new String[] {
                "Inception",
                "Avatar",
                "Fast and furious",
                "Star Wars",
                "Interestelar",
                "Troya",
                "Ip man"
        };
        String title = play(titleArray, 0);
        String title2 = play(titleArray);
        System.out.println();
        pause(title);
        System.out.println();
        pause(title2);
    }
    public static String play(String[] titleArray, int index) {
        if (index < titleArray.length) {
            String title = titleArray[index];

            for ( int i=0; i < 2; i++) {
                System.out.println("Playing movie " + title);
            }
            return title;
        } else {
            System.out.println("Index is too big");
            return "";
        }

    }
    /*
    Ejemplo sobrecarga
     */
    public static String play(String[] titleArray) {
        Random numRandom = new Random();
        int index = numRandom.nextInt(titleArray.length-1);
        String title = titleArray[index];
            for ( int i=0; i < 2; i++) {
                System.out.println("Playing movie " + title);
            }
            return title;
    }
    public static void pause(String title) {
        if (title.isEmpty()) {
            System.out.println("No movie playing");
        } else {
            System.out.println("Movie paused: " + title);
        }

    }
}
