package com.example.ejemplos;

import java.io.*;

public class EjemploBufferInputStream {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:/Users/josei/Desktop/prueba.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            // el metodo Bufferd Es para leer de parte en parte de lo que esta en memoria, no completo
            //luego de leer lo que esta en me moria, se guarda en memoria lo siguiente

            try {
                int datos = ficheroBuffer.read();

                while (datos!= -1) {
                    //"EOF = endo of file el -1 es cuando ya leyo_todo"
                    System.out.print((char)datos);
                    datos = ficheroBuffer.read();
                }

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
    }
}
