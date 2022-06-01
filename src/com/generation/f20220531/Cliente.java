package com.generation.f20220531;

import java.util.List;

public class Cliente {
    private String rut;           //Cuando no agregamos nada por default solo podra usarlo la clase y el package
     private Integer id;          // ni public ni protected ni private
     private List<Integer> numeroVenta; // en ete caso los atributos tienen como accesador por default
     private String nombre;
     private String correo;


     //consrtuctores
    // se crean para asignar valores a nuestros objetos
    // constructor vacio le asignamos el contenido a nustros atributos despues
    // en el constructor con parametros asignamos valores a todos los atributos

    public Cliente() {
    }

    public Cliente(String rut, Integer id, List<Integer> numeroVenta, String nombre, String correo) {
        this.rut = rut;
        this.id = id;
        this.numeroVenta = numeroVenta;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void modificarAtributo() {
        this.rut = "12345656-1";
        nombre = "Donato";
    }

     /**Para acceder a atributos private solo se hace con getter y setter.**/
    // set y get

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getId(int i) {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(List<Integer> numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
