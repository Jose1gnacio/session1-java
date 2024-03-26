package com.example.estructurasdecontrol.repeticion;

public class ForEach {

    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Maria", "Jose", "Pedro",};
        for (String nombre : nombres) {
            System.out.println(nombre);

        }

        int suma = 0;
        int[] numeros = {1, 2, 3};
        for (int numero : numeros) {
            suma += numero;
            System.out.println(suma);
        }
        System.out.println(suma);
    }
}
