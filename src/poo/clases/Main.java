package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        // 1. CLases y objetos



            // creando un objeto utilizando constructor vacio
        //Clase identificador = new Clase();
        Vehiculo toyotaPrius = new Vehiculo();

        // creando un objeto utilizndo el constructor con parametros
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
        Vehiculo kiaCerato = new Vehiculo("Kia", "Cerato", 1.6, 2014, true,0, motorGTI);
        System.out.println(kiaCerato.fabricante);
        System.out.println(kiaCerato.modelo);
        System.out.println(kiaCerato.speed); // speed = 0
        kiaCerato.acelerar(50);
        System.out.println(kiaCerato.speed); // speed = 50

        // 2. Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println("Fin del programa");

        // 3. Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(100);

        vehiculo = new Coche();
        vehiculo.acelerar(100);

        vehiculo = new Camion();
        vehiculo.acelerar(100);

        // 4. CLases abstractas no se pueden instanciar,(crear un objeto), solo se instancian las clases hijas



    }
}
