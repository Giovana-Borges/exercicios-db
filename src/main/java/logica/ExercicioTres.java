package logica;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioTres {
    //Dada uma lista de 3 notas, calcule a média simples e, caso a média seja maior ou
    //igual a 7, retorne "Aluno aprovado :)", se for menor que 7, retorne "Aluno reprovado :(
    public static void main(String[] args){
        double nota1, nota2, nota3, media;

        System.out.println("Calculando média simples de uma lista de 3 notas ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = teclado.nextDouble();

        double[] listaDeNotas = new double[3];
        listaDeNotas[0] = nota1;
        listaDeNotas[1] = nota2;
        listaDeNotas[2] = nota3;

        System.out.println("Lista de notas do aluno: ");
        for (double lista : listaDeNotas) {
            System.out.println(lista);
        }

        media = ((nota1 + nota2 + nota3) /3);
        System.out.println("A média de notas deste aluno é " + media);

        if(media >= 7){
            System.out.println("Aluno aprovado :)");
        } else {
            System.out.println("Aluno reprovado :(");
        }


    }
}
