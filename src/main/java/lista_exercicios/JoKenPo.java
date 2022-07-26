package lista_exercicios;
import java.util.Scanner;
public class JoKenPo {
    public static void main(String[] args){
        /* PEDRA é maior que tesoura e menor que papel
           TESOURA é maior que papel e menor que pedra
           PAPEL é maior que pedra e menor que tesoura
           EMPATE escolha do jogador igual escolha do computador
           escolha da máquina aleatória

         */
        int jogador;
        int computador;
        Scanner scan = new Scanner(System.in);
        System.out.println("JOKENPO");
        System.out.println("=============");
        System.out.println("PEDRA = 1     TESOURA = 2     PAPEL = 3 ");
        System.out.println("=============");
        System.out.println("Digite qual a opção você deseja usar, digitando 1, 2 ou 3: ");
        jogador = scan.nextInt();
        //gerando uma escolha aleátoria entre 1,2 e 3
        computador = (int)(Math.random()*3 + 1);

        int resultadoEscolhaJogador = escolhaJogador(jogador);
        System.out.println(resultadoEscolhaJogador);

        int resultadoEscolhaComputador = escolhaComputador(computador);
        System.out.println(resultadoEscolhaComputador);

        boolean resultadoPartida = resultadoPartida(jogador, computador);
        System.out.println(resultadoPartida);

    }
    public static int escolhaJogador(int jogador){

        switch (jogador){
            case 1:
                System.out.println("Jogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Jogador escolheu TESOURA");
                break;
            case 3:
                System.out.println("Jogador escolheu PAPEL");
                break;
        }
        return 0;
    }
    public static int escolhaComputador(int computador){
        switch (computador){
            case 1:
                System.out.println("Computador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Computador escolheu TESOURA");
                break;
            case 3:
                System.out.println("Computador escolheu PAPEL");
                break;
        }
        return 0;
    }
    public static boolean resultadoPartida(int jogador, int computador){
        if((jogador == 1 & computador == 2) || (jogador == 2 & computador == 3) || (jogador == 3 & computador == 3)){
            System.out.println("JOGADOR VENCEU!");
        }else if(jogador == computador){
            System.out.println("EMPATE!");
        }else{
            System.out.println("COMPUTADOR VENCEU!");
        }
        return true;
    }
}
