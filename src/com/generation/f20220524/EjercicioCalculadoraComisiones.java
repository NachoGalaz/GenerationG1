package com.generation.f20220524;


import java.util.Scanner;

public class EjercicioCalculadoraComisiones {
    public static void main(String[] args) {

        //capturar el ingreso por consola
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su monto de ventas $");
        int montoDeVentas = sc.nextInt();

        if (montoDeVentas >= 10000) {
            System.out.println("Su comision es $" + (montoDeVentas * 0.3));
        } else {
            if (montoDeVentas >= 5001) {
                System.out.println("Su comision es $" + (montoDeVentas * 0.2));
            } else {
                if (montoDeVentas >= 1001) {
                    System.out.println("Su comision es $" + (montoDeVentas * 0.1));
                } else {
                    System.out.println("Usted no obtuvo comision");
                }
            }


        }
    }
}


