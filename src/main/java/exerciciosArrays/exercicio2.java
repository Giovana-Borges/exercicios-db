package exerciciosArrays;
import java.util.Scanner;
public class exercicio2 {
    public static void main (String[] args){
        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];

        Scanner teclado = new Scanner(System.in);
        //construtor
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = teclado.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        //imprimindo vetorA
        System.out.println("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }

        System.out.println();

        //imprimindo vetorB
        System.out.println("Vetor B = ");
        for(int i = 0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }

    }
}
