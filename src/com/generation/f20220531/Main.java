package com.generation.f20220531;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //instancia de cliente
        Cliente cliente = new Cliente(); //si no agregamos constructores por default es el constructor vacio
        //Se agrega el constructor vacio cuando agregamos el constructor con parametros
        cliente.setId(1234);
        cliente.setNombre("Donato");
        cliente.setRut("123456789-0");

        //Excepciones

        Cliente clienteDatosDinamicos = new Cliente();

        System.out.println("Ingrese el id de Cliente");
        //Integer id = sc.nextInt();
        String idString = sc.nextLine();

        try {
            Integer id = Integer.parseInt(idString);
            clienteDatosDinamicos.setId(id);
            sc.nextLine();

            //cuando hay un nextLine abajo de un nextInt hay que poner un


            System.out.println("Ingrese el nombre de Cliente");
            String nombre = sc.nextLine(); //next line tiene un salto de linea por lo q lo toma como el dato ingresado
            //para solucionar hay qiue agregar un nextLine(); previo al Sout
            clienteDatosDinamicos.setNombre(nombre);

            System.out.println("Ingrese el Rut de Cliente");
            String rut = sc.nextLine();
            clienteDatosDinamicos.setRut(rut);

            System.out.println("Ingrese el Correo de Cliente");
            String correo = sc.nextLine();
            clienteDatosDinamicos.setCorreo(correo);

            Integer division = 100 / 0;
            System.out.println(division);

        }catch (ArithmeticException ae){
            System.out.println("Error al dividir por cero");

        }catch (NullPointerException npe) {
            System.out.println("No se puede realizar la operacion matematica");
        }catch (InputMismatchException ime {
            System.out.println();

        } catch (NumberFormatException nfe) {
            System.out.println("No puede ingresar un letra como identificador " + nfe);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error, contecte al administrador " + e);

        }


        //Arreglo clientes
*/


