package lista_exercicios;

import java.util.Arrays;
import java.util.Random;

public class VetorDeNumeros {
    public static void main(String[] args) {
        int tamanhoDoVetor = 10;

        System.out.println("Gerando vetor com números aleatórios: ");
        int[] vetorDeNumeros = gerarVetor(tamanhoDoVetor);
        System.out.println(Arrays.toString(vetorDeNumeros));

        System.out.println("================================");

        System.out.println("Ordenando vetor: ");
        int[] vetorOrdenado = ordenarVetor(vetorDeNumeros);
        System.out.println(Arrays.toString(vetorOrdenado));

        System.out.println("================================");
    }

    public static int[] gerarVetor(int tamanhoDoVetor) {
        int[] vetor = new int[tamanhoDoVetor];
        Random aleatorio = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(10) + 1;
        }

        return vetor;
    }

    public static int[] ordenarVetor(int[] vetor){
        int auxiliar;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < (vetor.length - i); ++j) {

                if (vetor[j - 1] > vetor[j]) {
                    auxiliar = vetor[j - 1];
                    vetor[j -1] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
        return vetor;
    }
}
