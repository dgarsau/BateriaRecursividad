package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean salir=false;

        while (!salir) {
            Menu.imprimirMenu1();
            int eleccion = Entrada.entradaInt();
            elegirModo(eleccion);
            Menu.imprimirMenu2();
            String eleccion2 = Entrada.entradaModo();
            salir=elegirModo2(eleccion2);
        }

    }

    public static void elegirModo(int eleccion) {

        switch (eleccion) {
            case 1:
                Ejercicio1.ejercicio1();
                break;
            case 2:
                Ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3.ejercicio3();
            case 4:
                Ejercicio4.ejercicio4();
            case 5:
            case 6:
            case 7:
        }
    }

    public static boolean elegirModo2(String eleccion){
        switch (eleccion){
            case "M":
                return false;
            case "X":
                return true;
        }
        return true;
    }
}