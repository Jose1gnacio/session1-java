package com.example.estructurasdecontrol.condicionales;

public class If {

    public static void main(String[] args) {

        int edad = 17;
        boolean esMayorDeEdad = edad >= 18; // esto sera false
        if (esMayorDeEdad) {

            System.out.println("es mayor de edad");
        }
        if (edad >= 18) {

            System.out.println("es mayor de edad");
        }
        System.out.println("es menor de edad");


    }
}
