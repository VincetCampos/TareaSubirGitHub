package com.company;

import java.util.Scanner;

public class Main {


    private static Funciones funciones = new Funciones();

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String selec;

        System.out.println("Tarea para subir a github");

        do {
            System.out.println("1. Para ingresar un carro");
            System.out.println("2. Para ver los carros");
            selec = ent.nextLine();

            if(selec.equals("1")){
                funciones.crearCarro();

            }else if(selec.equals("2")){
                funciones.verCarro();
            }

            System.out.println("Desea realizar una nueva accion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            selec = ent.nextLine();
        }while (selec.equals("1"));
    }
}
