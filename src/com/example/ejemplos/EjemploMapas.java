package com.example.ejemplos;
import java.util.HashMap;
import java.util.Map;

public class EjemploMapas {
    public static void main(String[] args) {
        //mapas o array asociativo
        //no puedo duplicar clave
        //la clave no puede tener multiples valores, esto se sobreescriben y predomina el ultimo

        //Crear mapa y sus claves y valores
        HashMap<String, Integer> mapa = new HashMap<>();//claves cadenas de texto, y los valores son enteros
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave3", 40);

        System.out.println(mapa);
        System.out.println(mapa.get("clave1"));

        //Cambiar dato de clave
        mapa.replace("clave2", 21);//la manera adecuada de cambiar el valor
        mapa.replace("clave4", 41);//si no existe la clave lo ignora

        //Eliminar clave
        mapa.remove("clave2");//elimina la clave
        System.out.println(mapa);

        //Recorrer un mapa

        for (Map.Entry elemento : mapa.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());

        }


    }
}
