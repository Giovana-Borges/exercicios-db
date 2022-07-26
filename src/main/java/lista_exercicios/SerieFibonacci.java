package lista_exercicios;
import java.util.Scanner;
public class SerieFibonacci {
    public static void main(String[] args){
        int numero;
        int n;
        int i = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero =scan.nextInt();

        int resultadoSerie = imprimeSerie(numero, i);
        System.out.println("Resultado do método: " + resultadoSerie);

    }
    public static int calculaSerie(int n){
        int f = 0;
        int f1 = 0;
        int f2 = 1;

        if(n == 1)
            return 0;
        if(n == 2)
            return 1;

        for(int i = 3; i <= n; i++){
                f = f1 + f2;
                f1 = f2;
                f2 = f;
        }
        return (f);
    }
    public static int imprimeSerie(int numero, int i){
        for(i = 0; i <= numero; i++){
            System.out.printf("%d", calculaSerie(i));
            System.out.println(" ");
        }
        return 0;
    }
}



