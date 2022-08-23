package lista_exercicios;
import java.util.Scanner;
public class LeitorDeNumeros {
    public static void main(String[] args){
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = scan.nextInt();

        int resultadoLeitor = leitorNumeros(num, scan);
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
