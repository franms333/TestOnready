package org.frank.onready;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    public Moto(String marca, String modelo, int cilindrada, double precio){
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "// " + "Modelo: " + getModelo() + "// " + "Cilindrada: " + cilindrada + "cc " + "// " + "Precio: " + "$" + getPrecio();
    }
}
