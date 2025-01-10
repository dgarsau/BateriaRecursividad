package org.example;

public class Ejercicio2 {

    public static void ejercicio2(){
        System.out.println("Ejercicio 2: Calcular potencia.");

        int numero = Entrada.entradaInt();
        int potencia = Entrada.entradaInt();

        int resultado = calcularPotencia(numero, potencia);
        System.out.println(resultado);
    }

    public static int calcularPotencia(int numero, int potencia){

        if(potencia==0){
            return 1;
        }
        if(potencia<0){
            return 0;
        }

        return numero*calcularPotencia(numero, --potencia);
    }
}
