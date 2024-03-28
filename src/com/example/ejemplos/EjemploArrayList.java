package com.example.ejemplos;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        //Cuando se alcanza la capcidad maxima del arrayList, esta aumenta demanera automatica en un 50% del maximo.
        //Se agregan y sacan objetos de la misma forma que en un vector.
        //Se recorre de la misma forma que un vector.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        //Convertir un arrayList en una array

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);

        }
        for(String i : array){
            System.out.println("El elemento es: " + i);
        }

        //convertir una arraylist a array al mismo tiempo que se recorre, no es comun
        for (Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }



    }
}
