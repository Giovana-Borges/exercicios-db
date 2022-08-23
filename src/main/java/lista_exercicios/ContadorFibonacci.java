package lista_exercicios;
import java.util.Scanner;
public class ContadorFibonacci {
    public static void main(String[] args){
        int numero;
        int n;
        int i = 0;
        int numLimite;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para calcular a série Fibonacci: ");
        numero = scan.nextInt();
//        System.out.println("A contagem não pode passar do valor: ");
//        numLimite = scan.nextInt();

        int resultadoSerie = imprimeSerie(numero, i);
        System.out.println(resultadoSerie);
    }
    public static int calculaSerie(int n){
        int f = 0;
        int f1 = 0;
        int f2 = 1;

        if ( n == 1)
            return 0;
        if (n == 2)
            return 1;

        for(int i = 3; i <= n; i++){
            f = f1 + f2;
            f1 = f2;
            f2 = f;

        }
        return (f);
    }
    public static int imprimeSerie(int numero, int i) {
        //como usar while para parar a contagem em determinado valor
        for(i = 1; i <= numero; i++){
            System.out.printf("%d", calculaSerie(i));
            System.out.println(" ");
        }
        return calculaSerie(i);
    }

}
