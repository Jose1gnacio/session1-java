package com.example.ejemplos;

public class EjemploSwitchCase {
    public static void main(String[] args) {
        var estacion = "primavera";

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("es otra estacion");
        }

    }
}
