package org.frank.onready;

import com.sun.deploy.panel.IProperty;

public class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Vehiculo vehiculo) {
        if (vehiculo.getPrecio()>precio){
            return 1;
        } else if (vehiculo.getPrecio()==precio){
            return 0;
        } else {
            return -1;
        }
    }
}
