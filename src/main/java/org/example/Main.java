package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu.imprimirMenu1();
        int eleccion = Entrada.entradaInt();
        elegirModo(eleccion);

    }

    public static void elegirModo(int eleccion) {

        switch (eleccion) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
        }
    }
}