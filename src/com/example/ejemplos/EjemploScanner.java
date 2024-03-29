package com.example.ejemplos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        //Copiar un fichero
        try {
            InputStream in = new FileInputStream("C:/Users/josei/Desktop/prueba.txt");
            byte[] datos = in.readAllBytes();
            in.close();//buena practica, cerrar descriptor con close, siempre al final

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();//cerrar descriptor, siempre al final

        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

    }

}
