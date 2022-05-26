package com.generation.f20220526;

public class FuncionesCalc2 {
    public static void main(String[] args) {
       /** Libreria Math **/

         //elevar o potencia
        double numeroElevado = Math.pow(4.9, 3);
        System.out.println(numeroElevado);

        //Redondear al entero mayor
        double enteroMayor = Math.ceil(numeroElevado);
        System.out.println(enteroMayor);

        //Redondear al entero menor
        double enteroMenor = Math.floor(numeroElevado);
        System.out.println(enteroMenor);

        //Redondeo
        double enteroRedondeado = Math.round(numeroElevado);
        System.out.println(enteroRedondeado);

        //Numeros aleatorios
        //Math.random(); >= 0,0 y < 1.0

        double aleatorio = Math.random();
        System.out.println(aleatorio);

        //Numeros aleatorios entre 0 y 10
        double num010 = Math.random() * 10; // para obtener entre 0 y algo se multiplica por el algo
        System.out.println(num010);

        //Numeros aleatorios entre 2 y 8
        double num28 = 2 + (Math.random() * (8-2)); // al max se le resta el minimo y luego al total se suma el min
        System.out.println(num28);
        System.out.println(Math.abs(num28)); //absoluto
        System.out.println(Math.round(num28));

        //Numero entre -4 y 4
        double numNegPos = (Math.random()*(4+4))-4;
        System.out.println(numNegPos);


    }
}
