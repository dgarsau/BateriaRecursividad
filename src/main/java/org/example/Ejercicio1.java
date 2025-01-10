package org.example;

public class Ejercicio1 {

    static int Contador=1;

    public static void ejercicio1(){
        System.out.println("Ejercicio 1. Cantidad de digitos de un número.");
        Contador=1;

        int numero=Entrada.entradaInt();
        int resultado=digitos(numero);
        System.out.println("El número tiene " + resultado + " digitos.");
    }

    //Este es el metodo que hice yo
    public static int calcularTamanyo(int numero){

        if (numero==0) {
            return 0;
        }
        if(numero>=10){
            Contador++;
            calcularTamanyo(numero/10);
        }

        return Contador;
    }

    public static int digitos (int numero){
        if (numero==0){
            return 0;
        }
        return 1 + digitos(numero/10);
    }
}
