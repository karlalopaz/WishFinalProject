package com.wish.utils;

public class Producto {

    double precio;
    double precioAnterior;


    public Producto(double precio, double precioAnterior)
    {
        this.precio= precio;
        this.precioAnterior = precioAnterior;
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
