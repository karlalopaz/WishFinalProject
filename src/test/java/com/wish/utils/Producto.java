package com.wish.utils;

public class Producto {

    String nombre;
    double precio;
    double precioAnterior;


    public Producto(String nombre, double precio, double precioAnterior)
    {
        this.nombre = nombre;
        this.precio= precio;
        this.precioAnterior = precioAnterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioAnterior() {
        return precioAnterior;
    }

    public void setPrecioAnterior(double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }

}
