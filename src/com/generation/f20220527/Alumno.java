package com.generation.f20220527;

public class Alumno {

    //Atributos

    private String Nombre;
    private String Apellido;
    private Integer Rut;

    //Constructores


    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Integer rut) {
        Nombre = nombre;
        Apellido = apellido;
        Rut = rut;
    }


    //Getter y setter

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getRut() {
        return Rut;
    }

    public void setRut(Integer rut) {
        Rut = rut;
    }


    //Metodos

}
