package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Funciones {

    Map<Integer, String> listaCarros = new HashMap<>();

    Scanner entrada = new Scanner(System.in);

    public void crearCarro(){
        String ingreso;

        System.out.println("Ingrese el id del carro");
        ingreso = entrada.nextLine();
        int id = Integer.parseInt(ingreso);
        System.out.println("Ingrese la marca del Carro");
        ingreso = entrada.nextLine();
        String marca = ingreso;

        listaCarros.put(id, marca);

    }

    public void verCarro(){
        for (Integer key : listaCarros.keySet()) {
            System.out.println("id del carro : " + key + " marca del carro: " + listaCarros.get(key));
        }
    }
}
