package org.example;

public class Menu {

    public static void imprimirMenu1(){

        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("    1 - Dígitos");
        System.out.println("    2 - Potencias");
        System.out.println("    3 - Del Revés");
        System.out.println("    4 - Binario");
        System.out.println("    5 - A binario");
        System.out.println("    6 - Orden alfabético");
        System.out.println("    7 - Mostrar suma");
    }

    public static void imprimirMenu2(){

        System.out.println("Elige una opción:");
        System.out.println("    [M] - Volver al menú principal");
        System.out.println("    [X] - Salir");
    }

    public static void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
