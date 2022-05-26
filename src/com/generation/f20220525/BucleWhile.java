package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la opcion (1) para entrar: (0) para salir");
        int opcion = sc.nextInt(); //Capturando el ingreso por consola

        /**VALIDAR EL INGRESO ERRONEO DE LA OPCION**/

        //while valida que la condicion sea verdadera
         while (opcion != 1 && opcion != 0){

             System.out.println("Ingrese la opcion (1) para entrar: (0) para salir");
             opcion = sc.nextInt();

         }



    }
}





