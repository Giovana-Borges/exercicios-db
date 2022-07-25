public class TesteTecnico {
    /* Implementar um gerenciador de limite de cartão de crédito.
    o As entradas são: limite e lista de compras;
    o A saída deve ser 1 se o limite foi excedido e 0 se o limite não foi;
    o O limite é excedido quando a soma das compras é maior que o limite */
    public static void main(String[] args){
        int limite = 200;
        int[] listaDeCompras = {50, 50, 60, 40};

        int verificacao = gerenciadorLimiteCartaoCredito(limite, listaDeCompras);

        if(verificacao == 1){
            System.out.println("Limite execedido");
        }else{
            System.out.println("Limite não foi excedido");
        }
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


}
