package com.example.ejemplos;

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
        String title = play(titleArray, 11);
        System.out.println();
        pause(title);
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
    public static void pause(String title) {
        if (title.isEmpty()) {
            System.out.println("No movie playing");
        } else {
            System.out.println("Movie paused: " + title);
        }

    }
}
