package lista_exercicios;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        int tam = 3;
        int[] listaDeNotas = new int[tam];
        System.out.println("Calculando média simples de uma lista de " + tam + " notas ");

        geraListaDeNotas(listaDeNotas);

        imprimeListaDeNotas(listaDeNotas);

        double imprimeResutaldoMedia = calculaMedia(listaDeNotas);
        System.out.println("A média de notas deste aluno é: " + imprimeResutaldoMedia);


        imprimeStatusDoAluno(listaDeNotas);

    }

    private static void imprimeListaDeNotas(int[] listaDeNotas) {
        System.out.println("Lista de notas do aluno: ");
        for (int lista : listaDeNotas) {
            System.out.println(lista);
        }
    }

    private static void geraListaDeNotas(int[] listaDeNotas) {
        for (int i = 0; i < listaDeNotas.length; i++) {
            listaDeNotas[i] = buscarNota(i + 1);
        }
    }
    private static int somaNotas(int[] lista){
        int soma = 0;
        for (int i = 0; i < lista.length; i++) {
            soma = soma + lista[i];
        }
        return soma;
    }
    private static double calculaMedia(int[] listaDeNotas) {

        double media = (double) somaNotas(listaDeNotas) / listaDeNotas.length;
        return media;
    }

    private static void imprimeStatusDoAluno(int[] listaDeNotas) {
        double mediaDoAluno = calculaMedia(listaDeNotas);

        System.out.print("Status: ");
        if (mediaDoAluno >= 7) {
            System.out.println("Aluno aprovado :)");
        } else {
            System.out.println("Aluno reprovado :(");
        }
    }

    private static int buscarNota(int posicao) {
        int nota = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota " + posicao + ":");
        nota = teclado.nextInt();
        return nota;
    }

}
