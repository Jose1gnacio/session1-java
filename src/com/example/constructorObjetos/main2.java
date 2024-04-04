package com.example.constructorObjetos;

public class main2 {
    public static void main(String[] args) {
        Movie2 toyStory = new Movie2("toy Story", "familiar", 90);
        System.out.println(toyStory.getTitle() + " " + toyStory.getGenre() + " " + toyStory.getDuration());
    }
}
