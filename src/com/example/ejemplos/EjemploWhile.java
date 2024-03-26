package com.example.ejemplos;

public class EjemploWhile {
    public static void main(String[] args) {
        int contador = 10;
        while (contador > 0) {
            System.out.println(contador);
            contador = contador - 5; // tambien se puede hacer de la forma corta: contador--;
            // o contador-=11; cuando restas otro numero
        }
    }
}
