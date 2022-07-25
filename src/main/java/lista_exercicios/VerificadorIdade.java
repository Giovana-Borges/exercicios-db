package lista_exercicios;
import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args){
        int idade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        idade = teclado.nextInt();

        boolean verificacao = Verificador(idade);
        System.out.println(verificacao);
    }
    public static boolean Verificador(int idade){
        if(idade >= 18){
            System.out.println("Você é maior de idade");
            return true;
        }
        System.out.println("Você é menor de idade");
        return false;
    }
}

