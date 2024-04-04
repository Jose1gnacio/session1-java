package com.example.sobreCargaConstructores;

import com.example.constructorObjetos.Movie2;

public class main3 {
    public static void main(String[] args) {
        Movie3 toyStory = new Movie3("toy Story", "familiar");
        Movie3 interestelar = new Movie3("Interestelar", "ficción", 90);
        Movie3 fastX = new Movie3();
        System.out.println(toyStory.getTitle() + " " + toyStory.getGenre() + " " + toyStory.getDuration());
        System.out.println(interestelar.getTitle() + " " + interestelar.getGenre() + " " + interestelar.getDuration());
        System.out.println(fastX.getTitle() + " " + fastX.getGenre() + " " + fastX.getDuration());
    }
}
