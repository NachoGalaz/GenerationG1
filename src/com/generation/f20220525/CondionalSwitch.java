package com.generation.f20220525;

import java.util.Scanner;

public class CondionalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //menu
        System.out.println("Ingrese opcion: ");
        System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
        int opcion = sc.nextInt();

        /**VALIDAR INGRESO ERRONEO DE LA OPCION**/
        while(opcion <0 || opcion > 4){
            System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();
        }
        System.out.println("Fuera del while");

        switch (opcion) {

            case 0:
                System.out.println("Finalizado");
                break;

            case 1:
            //Accion para la opcion1
                System.out.println("** Suma");
                break;
                // Break lo que hace es termianr, luego que realiza la accion, va salir

            case 2:
                System.out.println("** Resta");
                break;
            case 3:
                System.out.println("** Multiplicacion");
                break;

            case 4: //division
                System.out.println("** Division");
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }

        System.out.println("Fuera del Switch");

    int termino = 0; //

    while(termino <= 10) {
        System.out.println("el valor de termino es " + termino);
        termino++;
    }


    }
}
