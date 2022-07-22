package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Funciones {

    Map<Integer, String> listaCarros = new HashMap<>();

    Scanner entrada = new Scanner(System.in);

    public void crearCarro(Integer id, String marca){
        String ingreso;

        System.out.println("Ingrese el id del carro");
        ingreso = entrada.nextLine();
        id = Integer.parseInt(ingreso);
        System.out.println("Ingrese la marca del Carro");
        ingreso = entrada.nextLine();
        marca = ingreso;

        listaCarros.put(id, marca);

    }
}
