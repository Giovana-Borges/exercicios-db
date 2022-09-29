package logica;

import java.util.Random;
import java.util.Scanner;

public class ExercicioUm {
    //Dada uma lista de números, retorne a soma de todos os números.
    public static void main(String[] args) {
        int quantidadeNumeros;
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você deseja somar? ");
        quantidadeNumeros = scan.nextInt();
        int [] listaDeNumeros = geraListaDeNumeros(quantidadeNumeros, scan);
        imprimirListaDeNumeros(listaDeNumeros);
        int listaSomada = somaNumeros(listaDeNumeros);
        System.out.println("Soma de todos os números: " + listaSomada);
    }
    private static int[] geraListaDeNumeros(int quantidadeNumeros, Scanner scan){
        int[] lista = new int[quantidadeNumeros];

        for(int i = 0; i < lista.length; i++){
            System.out.println("Digite o " + (i+1) + "o. número: ");
            lista[i] = scan.nextInt();
        }
        return lista;
    }
    public static int somaNumeros ( int numeros[]){
        int soma = 0;

        //Acessando array
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i]; //somando
        }
        return soma;
    }
    private static void imprimirListaDeNumeros(int[] numeros){
        System.out.println("Lista de números: ");

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
