package com.example.ejemplos;

public class EjemplosString {
    public static void main(String[] args) {

        String cadena = "Mensaje de TEXTO";

        int cadenaLen = cadena.length();
        System.out.println(cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println(cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println(cadenaMayus);

        boolean resultado = cadena.startsWith("Men");
        if (resultado) {
            System.out.println("Comienza por lo que estoy buscando");
        } else {
            System.out.println("No esta lo que busco");
        }
    }
}
