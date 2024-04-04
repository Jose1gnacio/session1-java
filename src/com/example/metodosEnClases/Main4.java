package com.example.metodosEnClases;

import com.example.sobreCargaConstructores.Movie3;

public class Main4 {
    public static void main(String[] args) {
        Movie4 toyStory = new Movie4("toy Story", "familiar");
        Movie4 interestelar = new Movie4("Interestelar", "ficción", 90);
        Movie4 fastX = new Movie4();

        interestelar.play();
        toyStory.pause();

        int interestelarTotalFrames = interestelar.getTotalFrames();
        System.out.println("Total frames: " + interestelarTotalFrames);

        /*
        ejemplo toString
         */
        System.out.println();
        System.out.println(interestelar);
    }
}
