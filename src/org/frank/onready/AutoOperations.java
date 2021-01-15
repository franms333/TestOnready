package org.frank.onready;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutoOperations{
    public static void mostrarAutos(List<Vehiculo> vehiculos)
    {
        for (int i = 0; i< vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i));
        }
    }
    public static void mostrarAutosSorting(List<Vehiculo> vehiculos)
    {
        System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
        for (int i = 0; i< vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }
    }

    public static void masCaro(List<Vehiculo> vehiculos)
    { int max= 0;
      double precio= 0;
        for (int i = 0; i < vehiculos.size(); i++)
        {
            if (vehiculos.get(i).getPrecio() > precio) {
                max=i;
                precio=vehiculos.get(i).getPrecio();

            }
        }
        System.out.println("Vehículo más caro: " + vehiculos.get(max).getMarca() + " " + vehiculos.get(max).getModelo());
    }

    public static void masBarato(List<Vehiculo> vehiculos)
    {
        int min= 0;
        double precio= Double.MAX_VALUE;

        for (int i=0; i < vehiculos.size(); i++)
        {
            if (vehiculos.get(i).getPrecio() < precio){
                min= i;
                precio= vehiculos.get(i).getPrecio();
            }
        }
        System.out.println("Vehículo más barato: " + vehiculos.get(min).getMarca() + " " + vehiculos.get(min).getModelo());
    }

    public static void letraY(List<Vehiculo> vehiculos)
    {
        int contiene= 0;

                for(int i= 0; i < vehiculos.size(); i++)
                {
                    if (vehiculos.get(i).getModelo().matches(".*Y.*"))
                    {
                        contiene= i;
                    }
                }
        System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + vehiculos.get(contiene).getMarca() + " " + vehiculos.get(contiene).getModelo());
    }



}
