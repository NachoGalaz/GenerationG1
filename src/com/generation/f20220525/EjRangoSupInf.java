package com.generation.f20220525;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EjRangoSupInf {
    public static void main(String[] args) {

        /** Variables **/
        Scanner sc = new Scanner(System.in);
        int valorInferior = 0;
        int valorSuperior = 0;
        int numerosIngresados = 0;
        int SumaNumIng = 0;
        int TotalDentroRango = 0;
        int NumsFueraRango = 0;
        int IgualesRango = 0;

        /** Solicitud numeros usuario **/

        System.out.println("Ingrese un numero ");
        valorInferior = sc.nextInt();

        System.out.println("Ingrese un numero mayor");
        valorSuperior = sc.nextInt();


        /** Validacion numero Superior > numero Inferior **/
        //al ingresar un segundo numero y este ser menor que el primero pide nuevamente ingresar el segundo

        while   (valorInferior > valorSuperior){
            System.out.println("Numero menor al primero, para continuar ingrese un numero mayor");
            valorSuperior = sc.nextInt();
        }

        /** Solicitud de numeros a usuario **/

        do {
            System.out.println("Ingrese mas numeros, 0 cuando desee finalizar (sera incluido)");
            numerosIngresados = sc.nextInt();   // reemplaza variable con lo que ingreso usuario
            if (numerosIngresados > valorInferior && numerosIngresados < valorSuperior){ // Condicional numeros dentro del rango
                TotalDentroRango = (TotalDentroRango + numerosIngresados); // Operacion solicitada numeros dentro del rango
            }
            if (numerosIngresados < valorInferior || numerosIngresados > valorSuperior) { //Condicional numeros fuera del rango
                NumsFueraRango = (NumsFueraRango + 1); // Variable acumulativa para contar numeros fuera de rango
            }
            if(numerosIngresados == valorInferior || numerosIngresados == valorSuperior){ //Condicional numeros iguales al rango
                IgualesRango = (IgualesRango + 1); // Variable acumulativa para contar numeros iguales a los de rango
            }
            SumaNumIng = SumaNumIng + numerosIngresados; // no era necesario me equivoque


        } while (numerosIngresados != 0 ); // To do lo anterior mientras el numero ingresado sea distinto de 0

        System.out.println("La suma de los numeros dentro del rango es: " + TotalDentroRango);
        System.out.println("Los numeros fuera de rango fueron: " + NumsFueraRango);
        System.out.println("Los numeros iguales a los iniciales fueron: " + IgualesRango);






    }
}
