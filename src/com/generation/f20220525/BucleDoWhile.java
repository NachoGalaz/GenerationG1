package com.generation.f20220525;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        //DoWhile
        int termino = 8;
        do {
            System.out.println("DoWhile el valor de termino es " + termino);
            termino++;

        } while (termino <= 10);
        System.out.println("****************");

        while (termino <= 10) {
            System.out.println("While el valor de termino es " + termino);
            termino++;
        }

        System.out.println("****** fin *****");

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println(" \n (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();
            System.out.println("Ingrese opcion nuevamente");
        } while (opcion < 0 || opcion > 4);





    }
}
