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

        boolean resultado2 = cadena.endsWith("TO");
        if (resultado2) {
            System.out.println("Termina por lo que estoy buscando");
        } else {
            System.out.println("No esta lo que busco");
        }

        char letra = cadena.charAt(4);
        System.out.println(letra);


        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("la letra es " + cadena.charAt(i));
        }

        for (int i = cadena.length()-1; i >= 0 ; i--) {
            System.out.println("La letra es " + cadena.charAt(i));
        }
    }
}
