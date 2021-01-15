package org.frank.onready;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
        vehiculos.add(new Moto("Honda", "Titan", 125, 60000));
        vehiculos.add(new Auto("Peugeot", "208", 4, 250000));
        vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));

        AutoOperations.mostrarAutos(vehiculos);
        System.out.println("=============================");
        AutoOperations.masCaro(vehiculos);
        AutoOperations.masBarato(vehiculos);
        AutoOperations.letraY(vehiculos);
        System.out.println("=============================");
        Collections.sort(vehiculos);
        AutoOperations.mostrarAutosSorting(vehiculos);






    }
}
