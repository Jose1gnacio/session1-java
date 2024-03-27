package com.example.ejemplos;

public class EjemplosArrays {
    public static void main(String[] args) {
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        int arrayDos[] = {1, 2, 3, 4, 5};

        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        System.out.println("Longitud del array " + nombres.length);

        for (String i : nombres) { // forma corta o for each para recorrer un array
            System.out.println(i);
        }

        String ultimoNombre = "";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(i + " : " + nombres[i]);
            ultimoNombre = nombres[i];
        }
        System.out.println(ultimoNombre);

        // array bidimensional, se puedenusar para almacenar tipos de datos u hojas de calculos

        // inicializando valor de arra bidimensional sin cnoncer sus valores
        int arrayBidi[][] = new int[2][4];
        // rellenando primera fila
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        // rellenando segunda fila
        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i " + i);
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Estoy en i = " + i + " , j = " + j);
                System.out.println(arrayBidi[i][j]);

            }
        }

        // inicializando una array bidimensional conociendo los valores
        int arrayBidi2[][] = {
                {1, 2, 3, 4},
                {10, 20, 30, 40}
        };

        for (int i = 0; i < arrayBidi2.length; i++) {
            System.out.println("Valor de i " + i);
            for (int j = 0; j < arrayBidi2[i].length; j++) {
                System.out.println("Estoy en i = " + i + " , j = " + j);
                System.out.println(arrayBidi2[i][j]);

            }
        }



    }
}
