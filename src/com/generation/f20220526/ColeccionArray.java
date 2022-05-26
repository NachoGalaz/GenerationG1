package com.generation.f20220526;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {
        /** Array ESTATICOS **/
        // o arreglos, matrices

        String[] colores = {"red","blue","yellow","orange","black"};
        Integer[] numerosPares = {2,4,6,8,10,12};
        int [] primerosNumeros = {1,2,3,4,5,6,7,8,9,9,0};

        //Posicion inicual es 0
        // accede a la posicion []
        numerosPares [2] = 9; // sobreescribe la posicion 2 con el numeor 9
        //numerosPares [7] = 10; // error fuera de indice, el tamano del arreglo es 6
        //no podemos agregar por posicion si no exite un elemento
        System.out.println(colores[2]);
        System.out.println(numerosPares[2]);
        System.out.println(primerosNumeros[2]);

        System.out.println(colores);
        System.out.println(numerosPares);
        System.out.println(primerosNumeros);


        /** Imprimir tamano del arreglo **/
        System.out.println("Tamano array colores "+ colores.length);
        System.out.println("Tamano array numerosPares "+ numerosPares.length);
        System.out.println("Tamano array primerosNumeros "+ primerosNumeros.length);

        /** Imprimir el arreglo **/
         System.out.println(Arrays.toString(colores));
         System.out.println(Arrays.toString(numerosPares));
         System.out.println(Arrays.toString(primerosNumeros));
        // System.out.print(); (SIN ln) imprime para el lado, todo junto
         /** Recorrer un arreglo **/

        for (int i = 0; i < primerosNumeros.length; i++) {   //aca podemos definir donde dejar de imprimir
            System.out.println(primerosNumeros[i]);

        }
        System.out.println("\n"); //salto de linea

         /** foreach **/   //Imprime todo el arreglo
        for ( int i : primerosNumeros) {    //es como el for anterior pero mas automatico
            System.out.println(i);         //cuando llega al ultimo entiende que debe parar
        }







    }
}
