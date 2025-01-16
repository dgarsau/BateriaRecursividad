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
                break;
            case 4:
                Ejercicio4.ejercicio4();
                break;
            case 5:
                Ejercicio5.ejercicio5();
                break;
            case 6:
                Ejercicio6.ejercicio6();
                break;
            case 7:
                Ejercicio7.ejercicio7();
                break;
            default:
                System.out.println("El número introducido no corresponde a ningún modo.");
                break;
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