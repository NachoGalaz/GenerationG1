package com.generation.f20220526;

import java.util.Scanner;

public class Funciones { //Funciones o metodos
    public static void main(String[] args) { //static nos permite acceder al meotodo
        //Funciones
        //4 tipos de funciones
        //2 que retornan
        //2 no retornan
        //El main ya es una funcion por lo que se crean afuera
        // no puede crear un metodo (funcion) dentro de otro metodo, si puede llamar a otro metodo

        saludo(); // LLamado al metodo o funcion
        calculoSumaPares(true, 23,"10",44l,"Sumar");
        int edad = obtenerEdad();
        System.out.println(edad);

        Boolean mayorOMenor = validarMayorEdad(edad);
        if(mayorOMenor) {
            System.out.println("Puede ingresar al curso");
        }else{
            System.out.println("No tiene la edad suficiente para acceder al curso");
        }
    }
    //accesador    tipo_de_retorno  nombre_funcion (parametros a recibir)
    public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {
        System.out.println(numero1+numero3+Integer.parseInt(numero2)); //casteamos numero 2 ya que es string solo para esta ocasion
                                                                       //Luego vuelve a ser String

        //accesador puede ser public private o protected
        // void quiere decir que la funcion solo va ejecutar codigo, no retorna nada
        // nombre_funcion siempre se escribe con minuscula la primera letra
        // void no retorna valor hay que imprimir
    }

    public static void saludo (){ //static permite acceder al metodo
        System.out.println("Buenos dias");
        //Solicitar ingreso de datos, no necesariamente hay que poner parametros
    }

    //funciones que retornan un tipo de datos
    public static Integer obtenerEdad() {  //En este caso estamos pidiendo un retorno de un Integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad");
        Integer edad = scanner.nextInt(); //Por lo general se hace asi, se crea una variable
    return edad; //Tiene que haber un retorno, en este caso retornamos el contenido de la variable

    }

    public static Boolean validarMayorEdad(Integer edad){ //en este caso Integer edad es el retorno que queremos, un integer
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("Es menor de edad");
            return false;
        }
    }






}




