package lista_exercicios;
import java.util.Scanner;
public class Tabuada {
    public static void main (String[] args){
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber a tabuada de 1 até o 10: ");
        numero = scan.nextInt();

        System.out.println("Tabuada do número " + numero);
        imprimeTabuada(numero);
    }
    public static int multiplicaNumero(int numero, int indice){

        int numeroCalculado = numero * indice;

        return numeroCalculado;
    }
    private static void imprimeTabuada(int numero){
            for(int i = 1; i <= 10; i++){
                System.out.println(numero + " x " + i + " = " + multiplicaNumero(numero, i));
            }

    }
}
