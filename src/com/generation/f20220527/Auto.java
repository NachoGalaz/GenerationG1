package com.generation.f20220527;

public class Auto {
    // programacion orientada al objeto OOP Object oriented programation
    // Una clase es un modelo o prototipo a partir del cual se crean objetos
    // objeto = digitalizacion de una idea y toddo lo q esta conlleva

    //atributo de colaboracion : tomar un objeto y usarlo como atributo

    //Atributo
    //--Accesibilidad del atributo (private)
    //-- tipo (String)
    //-- nombreDelAtributo (color, marca,modelo, velocidad)

    private String color;
    private String marca;
    private String modelo;
    private double velocidad;

    //Constructores
    //--Va servir para otorgarle valores a nuestros atributos
    //Constructor vacio
    public Auto() {
    }
    //Constructor con parametros, click derecho generate y marcar todos los atributos
    public Auto(String color, String marca, String modelo, double velocidad) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //Accesadores y mutadores (get y set)
    // click derecho generate -> getter y setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    //Metodos o funciones (personalizadas)

    public void aumentarVelocidad(){
        this.velocidad = 10d;
        //this, al objeto en el que estamos posicionados, este objeto este atributo este valor
        
    }







}
