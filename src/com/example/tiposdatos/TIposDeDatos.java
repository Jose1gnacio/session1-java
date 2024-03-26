package com.example.tiposdatos;

public class TIposDeDatos {

    public static void main(String[] args) {
        //  1. numericos
            /*
            El tipo de dato solo se coloca para crear el dato, luego para cambiar el valor no hay que colocar
            que dato es

            Las variables siempre comienzan en minuscula
             */
            //  1.1 enteros
            byte variable1 = 11;
            short variable2 = 111;
            int variable3 = 1111;       // permite almacenar mayor informacion de datos
            long variable4 = 11111;     // permite mas capacidad aun


            //  1.2 decimales
            float variable5 = 5.5f;     // menor capacidad y siempre se debe colocar la f para indicar que es float
            double variable6 = 11.1d;   // mayor capacidad, se puede omitir letra d ya que lo toma por defecto
            variable6 = 11.11d;         // Cambie el valor de la variable 6, pero sin colocar double
            double precioSilla = 11.11;

        //  2. booleano

        boolean variable7 = false;
        boolean variable8 = true;

        //  texto
        char variable9 = 'a';
        String variable10 = "lorem";    // string es una clase y se escribe en mayuscula
    }
}
