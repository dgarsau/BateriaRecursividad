package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(){
        int numero=0;
        boolean error=true;
        while(error) {
            try {
                String cadena = entrada.next();
                numero = Integer.parseInt(cadena);
                error=false;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Entrada no válida, vuelve a introducir el número:");
                entrada.nextLine();
            }
        }
        return numero;
    }

    public static String entradaString(){
        String cadena = "";
        boolean error =true;
        while (error){
            cadena= entrada.next();
            if(!cadena.equals("M") || !cadena.equals("X")){
                System.out.println("ERROR. Entrada no válida, introduce una M o una X");
            }else {
                error=false;
            }
        }
        return cadena;
    }

}
