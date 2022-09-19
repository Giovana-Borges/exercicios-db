package lista_exercicios;

import java.util.Random;

public class VetorOrdenado {
    public static void main(String[] args){
        int tam = 10;
        int[] vetor1 = new int [tam];
        int[] vetor2 = new int [tam];
        int[] vetoresJuntosNaoOrdenado = new int [tam * 2];

        Random aleatorio = new Random();
        System.out.println("VETOR 1 NÃO ORDENADO");
        int[] vetor1NaoOrdenado = criarVetor(vetor1, aleatorio, tam);
        imprimirVetor(vetor1NaoOrdenado);

        System.out.println("VETOR 1 ORDENADO");
        int[] vetor1Ordenado = ordenarVetor(vetor1NaoOrdenado);
        imprimirVetor(vetor1Ordenado);

        System.out.println("VETOR 2 NÃO ORDENADO");
        int[] vetor2NaoOrdenado = criarVetor(vetor2, aleatorio, tam);
        imprimirVetor(vetor2NaoOrdenado);

        System.out.println("VETOR 2 ORDENADO");
        int[] vetor2Ordenado = ordenarVetor(vetor2NaoOrdenado);
        imprimirVetor(vetor2Ordenado);

        System.out.println("VETORES JUNTOS NÃO ORDENADOS");
        vetoresJuntosNaoOrdenado = juntarVetores(vetor1NaoOrdenado, vetor2NaoOrdenado);
        imprimirVetor(vetoresJuntosNaoOrdenado);

        System.out.println("VETORES JUNTOS E ORDENADOS");
        int [] vetoresJuntosOrdenados = ordenarVetor(vetoresJuntosNaoOrdenado);
        imprimirVetor(vetoresJuntosOrdenados);
    }
    public static int[] criarVetor(int[] vetor, Random aleatorio, int tam){

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(tam);
        }
        return vetor;
    }

    public static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");
        System.out.println("========================================");
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

    public static int[] juntarVetores(int[] vetor1Ordenado, int[] vetor2Ordenado){

        int[] vetorFinal = new int[vetor1Ordenado.length + vetor2Ordenado.length];

        System.arraycopy(vetor1Ordenado, 0, vetorFinal, 0, vetor1Ordenado.length);
        System.arraycopy(vetor2Ordenado, 0, vetorFinal, vetor1Ordenado.length, vetor2Ordenado.length);

        return vetorFinal;
    }


}
