package com.example.estructurasdecontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Miercoles";

        // ejemplos de como comparar
        boolean comprarNum = 5 == 5;  // forma compara num
        boolean rsultado = dia.equals("Martes"); // comparar string

        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana");

        } else if (dia.equals("Martes")){
            System.out.println("Hoy es Martes");
        } else {
            System.out.println("Hoy es mitad de semana");
        }
    }

}
