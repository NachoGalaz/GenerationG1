package com.generation.f20220524;

 // (?)

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        //capturar el ingreso por consola
        Scanner sc = new Scanner(System.in);
/*
        // validar la mayoría de edad
        // establecer punto critico : 18 años

      int mayoriaEdad = 18;

      //Solicitar ingreso de edad
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt(); //capturando el ingreso por consola, lo que ingrese va quedar guardao en edad

        if(edad >= mayoriaEdad){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("No esta permitido su ingreso");
        }
        /* Solicitar todos los string
        * Solicitar nombre sc.nextLine apellido, direccion
        * edad, numeroDireccion /numerico
        * saldo ($) min.50 mil menos de 50 mil no puede apostar. min apuesta 10 mil
        * Validar mayoria de edad, saldo,
        * si tiene mas de 50 mil cuanto apostara?
        *
        */




        //Solicitar datos String
        System.out.println("Ingrese su Nombre");
        String nombre = sc.nextLine();


        System.out.println("Ingrese su Apellido");
        String apellido = sc.nextLine();

        System.out.println("Ingrese la calle donde vive");
        String calleDondeVive = sc.nextLine();


        final int mayoriaEdad = 18;
        final int montoMinimo = 50000;

        //Solicitar datos numericos

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if(edad >= mayoriaEdad){
            System.out.println("\nBienvenido");

            System.out.println("\ningrese numero de la calle donde vive");
            int numeracionDondeVive = sc.nextInt();

            System.out.println("Con cuanto dinero cuenta $?");
            int saldo = sc.nextInt();
            if (saldo >= montoMinimo) {
                System.out.println("Cuanto desea apostar $?");
                int montoParaApostar = sc.nextInt();
                if (montoParaApostar >= 10000) {
                    System.out.println("Usted dispone de $"+ montoParaApostar+" para apostar");
                }else{
                    System.out.println("Monto minimo $10000");
                }
            }else{
                System.out.println("Usted no puede apostar");
            }

        }else{
            System.out.println("No esta permitido su ingreso");
        }


    }
}
