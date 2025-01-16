package org.example;

public class Ejercicio7 {
    static int Numero;
    public static void ejercicio7(){
        System.out.println("Ejercicio 7. Suma de una cadena de números.");
        Numero = Entrada.entradaInt();
        int resultado=sumarCadena(1, 0);

        if(resultado==0){
            System.out.println(0);
        } else {
            System.out.println("="+resultado);
        }
    }

    public static int sumarCadena(int contador, int total){
        if (contador>Numero) {
            return total;
        } else {
            if(contador==1) {
                System.out.print(contador);
            } else{
                System.out.print("+" + contador);
            }
            total+=contador;
            return sumarCadena(++contador, total);
        }
    }
}
