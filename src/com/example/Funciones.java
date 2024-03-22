package com.example;

public class Funciones {

    public static void main(String[] args) {

        // opcion 1 sin parametros y sin retorno
        showMenu();
        showMenu();

        // opcion 2 funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        // opcion 3 con parametros y sin tipo de retorno
        imprimirSaludo("Jose");

        // opcion 4 con parametros y tipo de retorno
        String nombre = "Ignacio";
        String apellido = "Alvarez";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);
    }

    //opcion 1
    static void showMenu(){
        System.out.println("Venta de zapatillas");
        System.out.println("1- Ver zapatillas");
        System.out.println("2- Comprar");
        System.out.println("3- salir");
    }

    //opcion 2
    static String getMenu(){
        return "Venta de zapatillas";
    }

    //opcion 3
    static void imprimirSaludo(String name) {
        System.out.println("Buenas tardes " + name);
    }

    //opcion 4
    static String obtenerSaludo(String param1, String param2){

        return "Buenas noches " + param1 + " " + param2;
    }
}
