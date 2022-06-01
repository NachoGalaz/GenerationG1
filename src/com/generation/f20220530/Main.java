package com.generation.f20220530;

import com.generation.f20220531.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Interfaces solo definen estructura. Solo definicion de metodo.
        //En cambio una clase implementa metodos.
        //las listas amplian las opciones de un arreglo(array)
        //creando instancia de objeto tiop ArrayList
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();
        //Este list(justoarriba) es el que amplia las opciones

        //Instancia de clase (new)
        Alumno alumno = new Alumno();  //Alumno = objeto creado anteriormente; alumno = variable creada
        //Forma comun de hacerlo, no necesariamente deben llamarse igual
        //Parentesis vacio, estamos invocando al constructor vacio
        Alumno alumno2 = new Alumno("Leonardo", "Utreras", 26,"G1");
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();

        listaAlumnos.add(alumno);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);

        //Get = unica forma de acceder a los datos

        System.out.println(alumno.getNombre());
        System.out.println(alumno2.getNombre());

        //Setter
        alumno.setNombre("Nicole");
        alumno2.setNombre("Coty");
        alumno3.setNombre("Hector");
        alumno4.setNombre("Ignacio");
        alumno5.setNombre("Fernando");

        alumno.setCurso("G1");
        alumno2.setCurso("G1");
        alumno3.setCurso("G1");
        alumno4.setCurso("G1");
        alumno5.setCurso("G1");

        alumno.setApellido("Mardonez");
        alumno2.setApellido("Olivares");
        alumno3.setApellido("Gomez");
        alumno4.setApellido("Galaz");
        alumno5.setApellido("Faundez");

        alumno.setEdad(27);
        alumno2.setEdad(28);
        alumno3.setEdad(29);
        alumno4.setEdad(29);
        alumno5.setEdad(29);

        System.out.println("Datos de alumno 1");
        System.out.println("- Nombre: " + alumno.getNombre());
        System.out.println("- Apellido: " + alumno.getApellido());
        System.out.println("- Edad: " + alumno.getEdad());
        System.out.println("- Curso: " + alumno.getCurso());
        System.out.println();

        System.out.println("Datos de alumno 1");
        System.out.println("- Nombre: " + alumno2.getNombre());
        System.out.println("- Apellido: " + alumno2.getApellido());
        System.out.println("- Edad: " + alumno2.getEdad());
        System.out.println("- Curso: " + alumno2.getCurso()); System.out.println("Datos de alumno 1");
        System.out.println();

        System.out.println("- Nombre: " + alumno3.getNombre());
        System.out.println("- Apellido: " + alumno3.getApellido());
        System.out.println("- Edad: " + alumno3.getEdad());
        System.out.println("- Curso: " + alumno3.getCurso());
        System.out.println();

        System.out.println("- Nombre: " + alumno4.getNombre());
        System.out.println("- Apellido: " + alumno4.getApellido());
        System.out.println("- Edad: " + alumno4.getEdad());
        System.out.println("- Curso: " + alumno4.getCurso());
        System.out.println();

        System.out.println("- Nombre: " + alumno5.getNombre());
        System.out.println("- Apellido: " + alumno5.getApellido());
        System.out.println("- Edad: " + alumno5.getEdad());
        System.out.println("- Curso: " + alumno5.getCurso());

        System.out.println(alumno.toString()); //Para imprimir la variable con todos sus atributos

        for (int i=0; i<listaAlumnos.size(); i++){
            System.out.println(listaAlumnos.get(i).getNombre());
            System.out.println(listaAlumnos.get(i).getApellido());
            System.out.println(listaAlumnos.get(i).getCurso());
            System.out.println(listaAlumnos.get(i).getEdad());
        }

        System.out.println();
        System.out.println("foreach");

        for (Alumno objetoAlumno : listaAlumnos) {
            System.out.println(objetoAlumno.getNombre());
            System.out.println(objetoAlumno.getCurso());

            /*System.out.println(objetoAlumno.toString());*/


        }

/**Todo esto gracias a que agregamos getter a setter en la clase que corresponde**/
        Cliente cliente = new Cliente();
        cliente.modificarAtributo();
        cliente.setNombre("ignacio"); //asigno
        System.out.println(cliente.getNombre()); //consultar el dato


        //Constructor con parametros











    }

}
