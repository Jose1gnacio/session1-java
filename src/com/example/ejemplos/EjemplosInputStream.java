package com.example.ejemplos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EjemplosInputStream {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:/Users/josei/Desktop/prueba.txt");

            try {
                int datos = fichero.read();

                while (datos!= -1) {
                    //"EOF = endo of file el -1 es cuando ya leyo_todo"
                    System.out.print((char)datos);
                    datos = fichero.read();
                }
                /*
                inicializamos datos para leer el primer byte y luego entrar al while
                si no se inicializa, nunca podriamos hacer funcionar el while.
                de esa misma forma, para luego leer el segundo byte, esque volvemos a asignar despues del print
                otro byte a la variable dato
                 */
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }

    }

}
