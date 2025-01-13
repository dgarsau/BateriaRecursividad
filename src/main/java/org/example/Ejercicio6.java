package org.example;

public class Ejercicio6 {

    static char palabra_vector[];

    public static void ejercicio6(){

        boolean ordenado = false;
        boolean ordenadoInv = false;
        System.out.println("Ejercicio 6. Comprobar si una palabra está ordenada alfabéticamente.");
        String palabra = Entrada.entradaString();
        palabra_vector=palabra.toCharArray();
        ordenado=comprobarOrden(0);
        ordenadoInv=comprobarOrdenInv(palabra_vector.length-1);

        if (ordenado){
            System.out.println("La palabra está ordenada alfabéticamente (ascendente).");
        } else if (ordenadoInv) {
            System.out.println("La palabra está ordenada alfabéticamente (descendente).");
        } else{
            System.out.println("La palabra no está ordenada alfabéticamente");
        }

    }

    public static boolean comprobarOrden(int contador){
        if(contador != palabra_vector.length-1){
            if(palabra_vector[contador]<=palabra_vector[contador+1]){
                return comprobarOrden(++contador);
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarOrdenInv(int contador){
        if(contador != 0){
            if(palabra_vector[contador]<=palabra_vector[contador-1]){
                return comprobarOrdenInv(--contador);
            }else {
                return false;
            }
        }
        return true;
    }
}
