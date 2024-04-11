package com.example.cineBox;

public class MediaDownloader {
    public interface DownLoadListener {
        void onMediaDownloaded(Media media, String content);
    }

    public static void download(Media media, DownLoadListener downLoadListener) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Dowloading " + media.getTitle());
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                    e.printStackTrace();
                }
                System.out.println(media.getTitle() + " Donwloaded!");
                String content = "Contenido de descargado de la pelicula";
                downLoadListener.onMediaDownloaded(media, content);
            }
        });
        thread.start();

    }
}
