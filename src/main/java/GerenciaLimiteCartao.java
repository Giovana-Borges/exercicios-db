import java.util.Arrays;
import java.util.Scanner;

public class GerenciaLimiteCartao {
    /* Implementar um gerenciador de limite de cartão de crédito.
    o As entradas são: limite e lista de compras;
    o A saída deve ser 1 se o limite foi excedido e 0 se o limite não foi;
    o O limite é excedido quando a soma das compras é maior que o limite */
    public static void main(String[] args){
        int limite = 0;
        int quantidadeDeItens = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("GERENCIADOR DE LIMITE DE CARTÃO DE CRÉDITO");
        System.out.println("==========================================");
        System.out.println("Qual o limite do seu cartão? ");
        limite = scan.nextInt();
        System.out.println("Quantos itens você vai comprar? ");
        quantidadeDeItens = scan.nextInt();

        int [] listaDeCompras = new int[quantidadeDeItens];
        int[] gerandoListaDeCompras = geraListaDeCompras(listaDeCompras, scan);
        System.out.println(Arrays.toString(gerandoListaDeCompras));

        int verificacao = gerenciadorLimiteCartaoCredito(limite, listaDeCompras);

        mensagemDeVerificacao(verificacao);
    }
    private static int[] geraListaDeCompras(int[] listaDeCompras, Scanner scan){


        for(int i = 0; i < listaDeCompras.length; i++){
            System.out.println("Digite o " + (i+1) + "o. valor: ");
            listaDeCompras[i] = scan.nextInt();
        }
        return listaDeCompras;
    }
    public static int gerenciadorLimiteCartaoCredito(int limite, int[] listaDeCompras){
        int soma = 0;
        for(int i = 0; i< listaDeCompras.length; i++){
            soma += listaDeCompras[i];
        }
        System.out.println("Soma lista de compras: " + soma);

        if(soma > limite){
           return 1;
        }
        return 0;
    }
    private static void mensagemDeVerificacao(int verificacao){
        if(verificacao == 1){
            System.out.println("Limite execedido");
        }else{
            System.out.println("Limite não foi excedido");
        }
    }


}
