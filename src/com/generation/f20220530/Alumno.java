package com.generation.f20220530;

public class Alumno {

    //Atributos
    //--> private pq solamente accedemos dentro de la misma clase
    private String nombre; //protected o public, accesadores por encapsulacion o encapsulamiento, proteccion info
    //-->protected se puede acceder desde todos las clases del mismo package
    //-->public cualquiera puede acceder
    /** 4 pilares de la programacion, 1encapsulamiento, 2herencia ( una clase padre hereda atributos)
     *
     * **/

    private String apellido;
    private int edad;
    private String curso;

    //Constructores

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    //Get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() { //click derecho generate -> toString
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }

    //Funciones

}
