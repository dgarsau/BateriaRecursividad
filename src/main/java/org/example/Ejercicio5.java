package org.example;

public class Ejercicio5 {
    public static void ejercicio5(){
        System.out.println("Ejercicio 5. Convertir a binario.");
        int numero = Entrada.entradaInt();
        System.out.println("El número en binario es " + convertirBinarioInt(numero));
    }

    public static String convertirBinario(int numero){

        if(numero==0 || numero==1){
            return Integer.toString(numero);
        }else{
            return convertirBinario(numero/2) + numero%2;
        }
    }

    public static int convertirBinarioInt(int numero){

        if(numero==0 || numero==1){
            return numero;
        }else{
            return numero%2+10*convertirBinarioInt(numero/2);
        }
    }
}
