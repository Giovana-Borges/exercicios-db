package lista_exercicios;
import java.util.Scanner;
public class LeitorDeNumeros {
    public static void main(String[] args){
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        int resultadoLeitor = leitorNumeros(numero, scan);
        System.out.println("Você digitou o número " + resultadoLeitor + ", você acertou!");
        scan.close();
    }
    public static  int leitorNumeros(int num, Scanner scan){

        while (num != 10){
            System.out.println("Tente outro número: ");
            num = scan.nextInt();
        }
        return num;
    }
}
