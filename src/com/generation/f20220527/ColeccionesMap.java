package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {
    public static void main(String[] args) {
        /** Colecciones Map **/  //o hashmap
        // Pares clave <-> valor
        //    HashMap <K, V> = new HashMap<K, V>();  // <Key, Value> / Esta manera de escribirlo
        //antes que tipo d evariables son <String, String> es mas restrictiva
        // K key o clave, V value o valor
        //HashMap mapa = new HashMap(); otra forma de escribirlo esta forma de escribirlo
        // es mas abierta, pero podemos ingresar mas datos que solamente los definidos
        //en un inicio.

        HashMap objHashMap = new HashMap();

        // .put
        objHashMap.put("Nombre", "Ignacio"); //(Clave, Valor)
        objHashMap.put("ApellidoP","Galaz");
        objHashMap.put("ApellidoM","Farias");
        objHashMap.put("Edad","29");
        System.out.println();// salto de linea
        System.out.println("Elementos del Mapa");
        System.out.println(objHashMap);

        //Obtener un valor a traves de la Key
        System.out.println(objHashMap.get("ApellidoP"));

        //Eliminar par (Key,value)
        objHashMap.remove("Edad"); //Solo con Key elimina el par
        System.out.println(objHashMap);
        System.out.println(); //salto de linea

        //Mostrar todas las llaves disponibles
        System.out.println("KeySet");
        System.out.println(objHashMap.keySet());
        System.out.println();//Salto de linea

        //Mostrar todos los valores en el mapa
        System.out.println("Values");
        System.out.println(objHashMap.values());
        System.out.println();

        //Array dentro de HashMap, lo mas parecido a una api
        ArrayList<String> vocales = new ArrayList<String>();
        vocales.add ("a");
        vocales.add ("e");
        vocales.add ("i");
        vocales.add ("o");
        vocales.add ("u");

        ArrayList<Integer> numeros = new ArrayList<Integer>(); //Integer pq debe ser objeto el dato ingresado en Hashmap

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);



        objHashMap.put("vocales",vocales );
        objHashMap.put("numeros",numeros );

        System.out.println(objHashMap);
        System.out.println();//salto de linea
        //Si no encuentra la clave retorna un null
        System.out.println(objHashMap.get("vocales"));

        //Como recorrer un HashMap
          //Por lo general no se trabaja directamente con el objeto, como
          // podria ser con la otra formula <Object, Object>



        for (Object clave: objHashMap.keySet()) {
            //For busca cada Key y sout la imprime
            // luego para tener value concatenamos con .get(key)
            // en .get se usa (clave) pq con el for clave va de key en key
            // por lo tanto sout imprime de valor en valor
            System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave));
        }

















    }
}















