package com.example.cineBox;

public abstract class Media implements Comparable<Media> {
    private String title;
    private String genre;
    private int duration;
    private String synopsis;
    private String content = "";

    public Media(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public abstract void play();
    public void pause() {

        printSomething("Pausing " + title);
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void printSomething(String something) {
        System.out.println(something);
    }

    public void moveForward(int minutes) {
        printSomething("Moving forward " + minutes + " minutes");
    }

    @Override
    public String toString() {
        return "Media title is: " + title;
    }

    @Override
    public int compareTo(Media otherMedia) {
        if(this.getDuration() > otherMedia.getDuration()){
            return 1;
        } else if (this.getDuration() < otherMedia.getDuration()) {
            return -1;
        } else {
            return this.getTitle().compareTo(otherMedia.getTitle());
        }
        //return this.getTitle().compareTo(otherMedia.getTitle());
    }
}
