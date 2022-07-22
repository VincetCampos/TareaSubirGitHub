package com.company;

import java.util.Scanner;

public class Main {


    private static Funciones funciones = new Funciones();

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String selec;

        System.out.println("Tarea para subir a github");

        System.out.println("1. Para ingresar un carro");
        System.out.println("2. Para ver los carros");
        selec = ent.nextLine();

        if(selec.equals("1")){
            funciones.crearCarro();

        }else if(selec.equals("2")){
            System.out.println("pronto");
        }

    }
}
