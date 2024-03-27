package com.example.ejemplos;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        /*
        - si sobrepaso la capacidad del vector, este siempre aumentara en el doble (si no
        se le indica en cuanto aumentar) y se realiza una copia de los elementos para ponerlos
        en el vector nuevo que doblo su capacidad.

        - Puedo indicarle la capacidad inicial al vector colocando el valor.

        - Puedo indicar tambien el valora incrementar cuando se sobrepasa la capacidad
        del vector.
         */
        Vector<Integer> vector = new Vector(11, 11);
        vector.add(10); // agregando datos a mi vector
        vector.add(20);
        vector.add(30);

        System.out.println("Datos del vector " + vector);

        vector.remove(2); // eliminando datos del vector según la posición, en este caso 2
        System.out.println("Datos del vector " + vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity()); // tamaño y capacidad del vector

        Vector<Integer> vector2 = new Vector(11, 11);
        vector2.add(11);
        vector2.add(22);
        vector2.add(33);

        boolean resultado = vector.equals(vector2);
        System.out.println(resultado);

        Vector<Integer> vector3 = new Vector();
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        vector3.add(4);

        for (int i: vector3) {
            System.out.println("Valor actual en vector: " + i);
        }
        for (int i = 0; i < vector3.size(); i++) {
            if ( i % 2 == 0) {
                vector3.remove(i);
                continue;
            }
            System.out.println("Valor en vector: " + vector3.get(i) + " en posicion " + i);
        }

        // hacer que el vector decresca sin usar remove
        Vector<Integer> vector4 = new Vector(16);
        vector4.add(1);
        vector4.add(2);
        vector4.add(3);
        vector4.add(4);

        System.out.println("Capacidad: " + vector4.capacity() + " tamaño: " + vector4.size());
        vector4.trimToSize();
        System.out.println("Capacidad: " + vector4.capacity() + " tamaño: " + vector4.size());



    }
}
