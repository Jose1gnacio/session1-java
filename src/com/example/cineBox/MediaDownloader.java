package com.example.cineBox;

public class MediaDownloader {
    public interface DownLoadListener {
        void onMediaDownloaded(String content);
    }

    public static void download(String mediaTitle, DownLoadListener downLoadListener) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Dowloading " + mediaTitle);
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                    e.printStackTrace();
                }
                System.out.println(mediaTitle + " Donwloaded!");
                String content = "Contenido de descargado de la pelicula";
                downLoadListener.onMediaDownloaded(content);
            }
        });
        thread.start();

    }
}
