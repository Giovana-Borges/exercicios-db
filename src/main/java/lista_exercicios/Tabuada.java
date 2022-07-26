package lista_exercicios;
import java.util.Scanner;
public class Tabuada {
    public static void main (String[] args){
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber a tabuada de 1 até o 10: ");
        numero = scan.nextInt();

        System.out.println("Tabuada do número " + numero);
        int verificaTabuada = tabuada(numero);
        System.out.println("Return do método: " + verificaTabuada);
    }
    public static int tabuada(int numero){
        for( int i = numero; i <= numero; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
        return 0;
    }
}
