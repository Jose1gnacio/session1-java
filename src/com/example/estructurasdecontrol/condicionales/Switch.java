package com.example.estructurasdecontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia = "Miercoles";

        switch (dia) {
            case "Lunes":
                System.out.println("Inicio de semana");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            default:
                System.out.println("Ya es Jueves");
        }
    }
}
