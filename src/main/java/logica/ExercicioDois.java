package logica;
import java.util.Scanner;
import java.util.Random;

public class ExercicioDois {
    //Dada uma lista de números e uma String "+" ou "*", some ou multiplique todos os
    //números dependendo do parâmetro.
    public static void main(String[] args) {
        int[] listaNumeros ={2,4,6,8};
        String sinalTexto;
        char sinal;

        System.out.println("Escolha qual operação você deseja efetuar, digitando * (para multiplicar) e + (para somar): ");

        Scanner teclado = new Scanner(System.in);
        sinalTexto = teclado.nextLine();
        sinal = sinalTexto.charAt(0);


        //imprime posição do índice e números aleatórios do array
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Posição na lista: " + (i + 1) + " || Número aleatório: " + listaNumeros[i]);

        }
        System.out.println(" ");

        boolean calculo = calculandoNumeros(listaNumeros, sinal);
        System.out.println(calculo);

        //MESMO RESULTADO DO LAÇO ACIMA!!
//        System.out.println("Confirmando posições e números aleatórios: ");
//        for (int lista : listaNumeros) {
//            System.out.println(lista);
//        }
    }

    public static boolean calculandoNumeros(int listaNumeros[], char sinal) {
        int soma = 0;
        int multiplica = 0;

        switch (sinal) {
            case '+':
                for (int i = 0; i < listaNumeros.length; i++) {
                    soma += listaNumeros[i];
                }
                System.out.println("Resultado do cálculo: " + soma);
                break;
            case '*':
                for (int i = 0; i < listaNumeros.length; i++) {
                    multiplica *= listaNumeros[i];
                }
                System.out.println("Resultado do cálculo: " + multiplica);
                break;
            default:
                System.out.println("Sinal de operação inválido");
        }
        return true;
    }
}
