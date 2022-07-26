package lista_exercicios;
import java.util.Random;
public class NumerosAleatorios {
    public static void main(String[] args){
        int [] numeros = new int[10];
        int maiorNumero = 0;
        int menorNumero = 100;

        int listaNumeros = listandoNumeros(numeros, menorNumero, maiorNumero);
        System.out.println(listaNumeros);

    }
    public static int listandoNumeros(int[] numeros, int menorNumero, int maiorNumero){
        Random ale =new Random();

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = ale.nextInt(101);
            System.out.println(numeros[i]);
            if(numeros[i] < menorNumero){
                menorNumero = numeros[i];
            }else if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("");
        System.out.println("O menor número é: " + menorNumero);
        System.out.println("O maior número é: " + maiorNumero);
        System.out.print("Return do método: ");
        return 0;
    }
}
