package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class CollecionArrayList {
    public static void main(String[] args) {
        //ArrayList DINAMICOS
        // Vamos a crear una instancia definiendo un arreglo de tipo objeto
        ArrayList <String> colores = new ArrayList<String>(); //Dentro del menor y mayor que, hay que escribir el tiop de dato
        ArrayList <Integer> numerosPares = new ArrayList<Integer>();

        //Agregar un elemento a la lista
        colores.add("rojo");
        colores.add("azul");
        colores.add(1,"verde"); // si existe un elemento en esa posicion
        // lo desplaza a la derecha, solo podemos agregar a la posicion siguiente (ademas de desplazar) a la que esta agregada
        // si no da error.

        //Imprimir resultado
        System.out.println(colores);

        //Acceder a un elemento especifico get(indice);
        System.out.println(colores.get(1));

        //Tamano del arreglo size()
        System.out.println(colores.size());

        //Modificiar un elemento .set
        colores.set(1, "negro");
        System.out.println(colores);


        //Recorrer el arreglo
             //recorrer arreglo hasta el punto indicado
             //en este caso < al tamano del arreglo para recorrer completo
             //pero puede ser menor y recorrer fracciones de este

        for (int i = 0; i < colores.size(); i++) {
            System.out.println("for " + colores.get(i));
        }

        System.out.println("****************"); //separador

        /** For each **/ //reccorre todo el arreglo hasta el final
        for (String i : colores) {
            System.out.println(i);
        }
        System.out.println("****************"); //separador

        //ordenar el arreglo de forma ascendente alfabeticamente
        //no es temporal, lo impacta directamente
        //de aqui hacia abajo va estar ordenado.

        Collections.sort(colores);
        System.out.println(colores);

        //Quitar un elemento arreglo.remove(posicion)
        colores.remove(2);
        System.out.println(colores);

        //Quitar todos los elementos
        colores.clear();
        System.out.println(colores);

        numerosPares.add(14);
        numerosPares.add(2);
        numerosPares.add(8);
        numerosPares.add(6);
        numerosPares.add(10);
        numerosPares.add(20);

        System.out.print(numerosPares +" ");
        System.out.println();
        Collections.sort(numerosPares);
        System.out.print(numerosPares + " ");

        System.out.println();
        //Reverse no ordena descendentemente solo invierte el orden
        Collections.reverse(numerosPares);
        System.out.println(numerosPares+ " ");

        //Para dar el efecto de descendente, primero ordenamos con collection.sort
        //Luego Collections.reverse para invertir el orden












    }
}
