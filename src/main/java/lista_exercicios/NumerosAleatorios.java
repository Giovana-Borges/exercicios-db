package lista_exercicios;

import java.util.Arrays;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int[] listaDeNumeros = new int[10];
        int maiorNumero = 0;
        int menorNumero = 100;

        System.out.println(Arrays.toString(geraListaDeNumeros(listaDeNumeros)));

        imprimeNumeroMaiorEMenor(listaDeNumeros, menorNumero, maiorNumero);
    }

    public static int[] geraListaDeNumeros(int[] listaDeNumeros) {
        Random ale = new Random();
        System.out.println("Gerando lista de números aleatórios: ");
        for (int i = 0; i < listaDeNumeros.length; i++) {
            listaDeNumeros[i] = ale.nextInt(101);
        }
        return listaDeNumeros;
    }

    private static int pegaMenorNumero(int[] listaDeNumeros, int menorNumero) {

        for (int i = 0; i < listaDeNumeros.length; i++) {
            if (listaDeNumeros[i] < menorNumero) {
                menorNumero = listaDeNumeros[i];
            }
        }
        return menorNumero;
    }

    private static int pegaMaiorNumero(int[] listaDeNumeros, int maiorNumero) {
        for (int i = 0; i < listaDeNumeros.length; i++) {
            if (listaDeNumeros[i] > maiorNumero) {
                maiorNumero = listaDeNumeros[i];
            }
        }
        return maiorNumero;
    }

    private static void imprimeNumeroMaiorEMenor(int[] listaDeNumeros, int menorNumero, int maiorNumero){

        System.out.println("O menor número é: " + pegaMenorNumero(listaDeNumeros, menorNumero));
        System.out.println("O maior número é: " + pegaMaiorNumero(listaDeNumeros, maiorNumero));

    }
}
