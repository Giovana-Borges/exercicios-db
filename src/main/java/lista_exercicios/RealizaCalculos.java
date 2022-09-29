package lista_exercicios;

import java.util.Scanner;

public class RealizaCalculos {
    public static void main(String[] args) {
        double primeiroNumero;
        double segundoNumero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite primeiro número: ");
        primeiroNumero = scan.nextDouble();
        System.out.println("Digite segundo número: ");
        segundoNumero = scan.nextDouble();

        char operacaoEscolhida = escolheOperacao(scan, primeiroNumero, segundoNumero);
        System.out.println("Operação escolhida: " + operacaoEscolhida);
    }
    private static double somaNumeros(double primeiroNumero, double segundoNumero){
        double adicao = 0;
        adicao = primeiroNumero + segundoNumero;

        System.out.println("-----------------------------");
        System.out.print("RESULTADO: ");
        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + adicao);
        System.out.println("-----------------------------");

        return adicao;
    }
    private static double subtraiNumeros(double primeiroNumero, double segundoNumero){
        double subtracao = 0;
        subtracao = primeiroNumero - segundoNumero;

        System.out.println("-----------------------------");
        System.out.print("RESULTADO: ");
        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtracao);
        System.out.println("-----------------------------");

        return subtracao;
    }
    private static double multiplicaNumeros(double primeiroNumero, double segundoNumero){
        double multipicacao = 0;
        multipicacao = primeiroNumero * segundoNumero;

        System.out.println("-----------------------------");
        System.out.print("RESULTADO: ");
        System.out.println(primeiroNumero + " * " + segundoNumero + " = " + multipicacao);
        System.out.println("-----------------------------");

        return multipicacao;
    }
    private static double divideNumeros(double primeiroNumero, double segundoNumero){
        double divisao = 0;
        if(segundoNumero != 0) {
            divisao = primeiroNumero / segundoNumero;

            System.out.println("-----------------------------");
            System.out.print("RESULTADO: ");
            System.out.println(primeiroNumero + " / " + segundoNumero + " = " +divisao);
            System.out.println("-----------------------------");
        }else{
            System.out.println("Impossível dividir");
        }
        return divisao;
    }
    private static char escolheOperacao(Scanner scan, double primeiroNumero, double segundoNumero){
        char sinal;
        String sinalTexto;

        System.out.println("Escolha a operação que você deseja realizar: ");
        System.out.println("[+]SOMA");
        System.out.println("[-]SUBTRAÇÃO");
        System.out.println("[*]MULTIPLICAÇÃO");
        System.out.println("[/]DIVISÃO");
        System.out.print("Sua escolha: ");
        sinalTexto = scan.nextLine();
        sinal = sinalTexto.charAt(0);

        switch (sinal){
            case '+':
                somaNumeros(primeiroNumero, segundoNumero);
                break;
            case '-':
                subtraiNumeros(primeiroNumero, segundoNumero);
                break;
            case '*':
                multiplicaNumeros(primeiroNumero, segundoNumero);
                break;
            case '/':
                divideNumeros(primeiroNumero, segundoNumero);
                break;
        }
        return sinal;
    }
}
