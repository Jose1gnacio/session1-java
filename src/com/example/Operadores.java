package com.example;

public class Operadores {

    public static void main(String[] args) {
        // aritmeticos
        int numero1 = 11;
        int numero2 = 14;
        int resultado1 = numero1 + numero2;

        System.out.println(resultado1);
        System.out.println(resultado1 + 11.11);

        // comparacion
        boolean resultado2 = numero1 > numero2; // false
        boolean resultado3 = numero1 < numero2; // true

        System.out.println(resultado2);
        System.out.println(resultado3);

        // operadores logicos && y ||
        boolean resultado4 = numero1 > 5 && numero1 < 30;   // true
        boolean resultado5 = numero2 > 100 && numero2 < 9;  // false

        System.out.println(resultado4);
        System.out.println(resultado5);

    }
}
