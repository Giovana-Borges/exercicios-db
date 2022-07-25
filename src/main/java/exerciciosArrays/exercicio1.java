package exerciciosArrays;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args){
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        Scanner teclado = new Scanner(System.in);
        //percorrendo indices do array
        for(int i = 0; i<vetorA.length; i++ ){
            System.out.println("Entre com o valor da posição: " + i);
            //atribuindo valor passado pelo teclado às posições do array
            vetorA[i] = teclado.nextInt();
            //atribuindo valores do vetorA para o vetorB
            vetorB[i] = vetorA[i];
        }

        //Imprimindo valores do vetorA
        System.out.println("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        //Imprimindo valores do vetorB = OBS.: DEVE SER IDENTICO AO VETOR ACIMA
        System.out.println("Vetor B = ");
        for(int i = 0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
    }
}
