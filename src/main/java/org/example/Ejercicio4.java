package org.example;

public class Ejercicio4 {
    public static void ejercicio4(){
        System.out.println("Ejercicio 4. Comprobar si un número es binario.");
        int numero = Entrada.entradaInt();
        comprobarBinario(numero);
    }

    public static void comprobarBinario(int numero){
        if(!(numero%10 == 1 || numero%10 == 0)){
            System.out.println("El numero no es binario");
        }else if (numero<10 && numero%10 ==0){
            System.out.println("El numero es binario");
        }else {
            comprobarBinario(numero/10);
        }
    }
}
