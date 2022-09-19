package logica;

import java.util.Random;

public class ExercicioUm {
    //Dada uma lista de números, retorne a soma de todos os números.
    public static void main(String[] args) {

        int [] numeros = {2, 4, 6, 8};

        System.out.println("Lista de números: ");
        int listaSomada = somaNumeros(numeros);
        System.out.println();
        System.out.println("Soma de todos os números: " + listaSomada);
    }
    public static int somaNumeros ( int numeros[]){
        int soma = 0;

        //Acessando array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            soma += numeros[i]; //somando
        }
        return soma;
    }
}
