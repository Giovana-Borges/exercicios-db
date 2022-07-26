package lista_exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DescontoProdutos {
    public static void main (String[] args){
        String nomeProduto;
        double preco;
        int qtdProduto;
        double taxaDesconto = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do produto que você deseja comprar: ");
        nomeProduto = scan.nextLine();
        System.out.println("Qual o valor do produto " + nomeProduto + "?");
        preco = scan.nextDouble();
        System.out.println("Digite a quantidade de " + nomeProduto + " que você deseja comprar: ");
        qtdProduto = scan.nextInt();

        boolean verificaDesconto = Desconto(preco, qtdProduto, taxaDesconto);
        System.out.println(verificaDesconto);

    }
    public static boolean Desconto(double preco, int qtdProduto, double taxaDesconto){
        DecimalFormat df = new DecimalFormat("###,###.##");

        if (qtdProduto >= 11 && qtdProduto <= 20){
            taxaDesconto = preco * 0.1;
            System.out.println("Você recebeu 10% de desconto, sua compra custará: " + df.format(taxaDesconto) + " reais.");
        }else if(qtdProduto >= 21 && qtdProduto <= 50){
            taxaDesconto = preco * 0.2;
            System.out.println("Você recebeu 20% de desconto, sua compra custará: " + df.format(taxaDesconto) + " reais.");
        }else if(qtdProduto > 50){
            taxaDesconto = preco * 0.25;
            System.out.println("Você recebeu 25% de desconto, sua compra custará: " + df.format(taxaDesconto) + " reais.");
        }else if (qtdProduto <= 10){
            preco = qtdProduto * preco;
            System.out.println("Você não recebeu desconto nesta compra, portanto custará: " + df.format(preco) + " reais.");
        }
        return true;
    }
}
