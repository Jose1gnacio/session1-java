package com.example.estructurasdecontrol.repeticion;

public class For {

    public static void main(String[] args) {

        int i = 0;
        for (i = 0; i <= 4; i++) {
            System.out.println(i);
        }

        String[] nombres = {"Juan", "Pedro", "Maria", "Jose", "Pedro",};
        for (int j = 0; j < nombres.length; j++) {
            System.out.println(nombres[j]);
        }

        int suma = 0;
        int[] numeros = {1, 2, 3};
        for (int k = 0; k < numeros.length; k++) {
            suma = suma + numeros[k];
        }
        System.out.println(suma);
    }
}
