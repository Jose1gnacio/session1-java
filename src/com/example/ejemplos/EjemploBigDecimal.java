package com.example.ejemplos;

import java.math.BigDecimal;

public class EjemploBigDecimal {
    //Se usa BigDecimal para representar datos exactos decimales enormes.

    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(11.1f);
        BigDecimal valorB = new BigDecimal(4);
        valorA.multiply(valorB);//multiplicar
        valorA.add(valorB);//sumar
        //si no guardo los valores en una variable, se almacenaran en la primera variable
        //en este caso en valorA
        System.out.println(valorA);//aqui internamente hace el proceso de mostrarlo en string
        System.out.println(valorA.toString());//aqui pido implicitamente que se muestre en string

    }
}
