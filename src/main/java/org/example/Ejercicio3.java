package org.example;

public class Ejercicio3 {
    public static void ejercicio3(){

        System.out.println("Ejercicio 3. Invertir (1 - Num / 2 - Texto):");
        int eleccion = Entrada.entradaInt();

        switch (eleccion){
            case 1:
                System.out.println("Has elegido invertir número.");
                ejercicio3Int();
                break;
            case 2:
                System.out.println("Has elegido invertir cadena.");
                ejercicio3String();
                break;
        }
    }

    public static void ejercicio3Int(){
        int numero = Entrada.entradaInt();
        invertirInt(numero);
    }

    public static void invertirInt(int numero){
        if(numero>=0 && numero<10){
            System.out.print(numero);
        }else {
            System.out.print(numero % 10);
            invertirInt(numero / 10);
        }
    }

    public static void ejercicio3String(){
        String cadena = Entrada.entradaString();
    }


}
