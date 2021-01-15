package org.frank.onready;

public class Auto extends Vehiculo {

    private int numPuertas;


    public Auto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    public Auto(String marca, String modelo, int numPuertas, double precio){
        super(marca, modelo, precio);
        this.numPuertas=numPuertas;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "// " + "Modelo: " + getModelo() + "// " + "Puertas: " + numPuertas + "// " + "Precio: " + "$" + getPrecio();
    }
}
