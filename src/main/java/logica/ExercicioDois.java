package logica;
import java.util.Scanner;
import java.util.Random;

public class ExercicioDois {
    //Dada uma lista de números e uma String "+" ou "*", some ou multiplique todos os
    //números dependendo do parâmetro.
    public static void main(String[] args){
        int [] listaNumeros = new int[5];
        String sinalTexto;
        char sinal;

        Random ale = new Random();
        System.out.println("Escolha qual operação você deseja efetuar, digitando * (para multiplicar) e + (para somar): ");
        
        Scanner teclado = new Scanner(System.in);
        sinalTexto = teclado.nextLine();
        sinal = sinalTexto.charAt(0);


        boolean calculo = calculandoNumeros(listaNumeros, sinal);
        System.out.println(calculo);

        //imprime posição do índice e números aleatórios do array
        for(int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = ale.nextInt(6);
            System.out.println("Posição na lista: " + (i+1) + " || Número aleatório: "+ listaNumeros[i]);

        }
        System.out.println(" ");

        //MESMO RESULTADO DO LAÇO ACIMA!!
        System.out.println("Confirmando posições e números aleatórios: ");
        for(int lista : listaNumeros){
            System.out.println(lista);
        }
    }
    public static boolean calculandoNumeros(int listaNumeros[], char sinal) {
        int soma = 0;
        int multiplica = 0;
       
//       Switch(sinal){
//            case '+':
//                for (int i = 0; i < listaNumeros.length; i++) {
//                    soma += listaNumeros[i];
//                }
//                System.out.println(soma);
//                break;
//            case '*':
//                for (int i = 0; i < listaNumeros.length; i++) {
//                    multiplica *= listaNumeros[i];
//                }
//                System.out.println(multiplica);
//                break;
//            default:
//                System.out.println("Sinal de operação inválido");

        return false;
    }
}
