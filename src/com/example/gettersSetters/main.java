package com.example.gettersSetters;

public class main {
    public static void main(String[] args) {
        Movie toyStory = new Movie();
        toyStory.setTitle("Toy Story");
        toyStory.setGenre("Familiar");
        toyStory.setDuration(90);
        System.out.println(toyStory.getTitle() + " " + toyStory.getGenre() + " " + toyStory.getDuration());
    }
}
