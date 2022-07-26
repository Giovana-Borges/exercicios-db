package lista_exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Calculadora {
    public static void main(String[] args){
        double num1;
        double num2;
        String sinalTexto;
        char sinal;


        System.out.println("-------------------");
        System.out.println("CALCULADORA SIMPLES");
        System.out.println("-------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a operação que você deseja realizar: ");
        System.out.println("[+]SOMA");
        System.out.println("[-]SUBTRAÇÃO");
        System.out.println("[*]MULTIPLICAÇÃO");
        System.out.println("[/]DIVISÃO");
        System.out.print("Sua escolha: ");
        sinalTexto = scan.nextLine();
        sinal = sinalTexto.charAt(0);
        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextDouble();

        double resultadoCalculo = efetuaCalculo(num1, num2, sinal);
        System.out.println("Return do método: " + resultadoCalculo);
    }
    public static double efetuaCalculo(double num1, double num2, char sinal){
        DecimalFormat df = new DecimalFormat("###,###.##");
        switch (sinal){
            case '+':
                System.out.println("-----------------------------");
                System.out.print("RESULTADO: ");
                System.out.println(num1 + " + " + num2 + " = " + df.format(num1 + num2));
                System.out.println("-----------------------------");
               break;
            case '-':
                System.out.println("-----------------------------");
                System.out.print("RESULTADO: ");
                System.out.println(num1 + " - " + num2 + " = " + df.format(num1 - num2));
                System.out.println("-----------------------------");
                break;
            case '*':
                System.out.println("-----------------------------");
                System.out.print("RESULTADO: ");
                System.out.println(num1 + " * " + num2 + " = " + df.format(num1 * num2));
                System.out.println("-----------------------------");
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("-----------------------------");
                    System.out.print("RESULTADO: ");
                    System.out.println(num1 + " / " + num2 + " = " + df.format(num1 / num2));
                    System.out.println("-----------------------------");
                }else{
                    System.out.println("Não é possível realizar este cálculo, pois o segundo número deve ser diferente de zero para efetuar uma divisão!");
                }
                break;
        }
        return 0;
    }
}
