package com.generation.f20220524;


import java.util.Scanner;

public class EjercicioCalculadoraComisiones {
    public static void main(String[] args) {

        //capturar el ingreso por consola
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su monto de ventas $");
        int montoDeVentas = sc.nextInt();
        String mensajeComision = "Su comision es $";
        float comision1 = (float) 0.3;
        float comision2 = (float) 0.2;
        float comision3 = (float) 0.1;

        if (montoDeVentas >= 10000) {
            System.out.println(mensajeComision + (montoDeVentas * comision1));
        } else {
            if (montoDeVentas >= 5001) {
                System.out.println(mensajeComision + (montoDeVentas * comision2));
            } else {
                if (montoDeVentas <5000 && montoDeVentas >= 1001) {
                    System.out.println(mensajeComision + (montoDeVentas * comision3));
                } else {
                    System.out.println("Usted no obtuvo comision");
                }
            }
        }

        int ticketNormal = 3500;
        String mensajeValorTicket = "El valor de su ticket es $";
        float descuentoNino = (float) 0.4;
        float descuentoAbuelo = (float) 0.45;
        float descuentoPorMayor = (float) 0.7;

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        if( edad <= 15){
            System.out.println(mensajeValorTicket + (ticketNormal * descuentoNino));
        }else{
            if (edad >= 60){
                System.out.println(mensajeValorTicket + (ticketNormal * descuentoAbuelo));
            }else{
                System.out.println(mensajeValorTicket+ ticketNormal);
                System.out.println("\nCuantos ticket desea comprar?");
                int cantidadTickets = sc.nextInt();
                if (cantidadTickets >= 2){
                    System.out.println("Promocion 30% descuento. El valor de sus tickets es $" +(cantidadTickets*ticketNormal*descuentoPorMayor) );
                }else{
                    System.out.println("No aplica descuento, el valor de su ticket es $"+ ticketNormal );
                }


            }
        }







    }
}


