import java.text.DecimalFormat;
import java.util.Scanner;
public class CalculaRendimento {
    public static void main (String[] args){
        /**As entradas são: valor, quantidade de meses, Taxa SELIC e Taxa Referencial
         Se a SELIC estiver abaixo de 8.5, a poupança rende 70% da SELIC + Taxa Referencial (ao mês)
         Se a SELIC estiver acima, a poupança rende 0.5% + Taxa Referencial (ao mês)
         A saída deve ser o resultado do investimento (inicial + rendimento).**/
        double valorInicial = 0;
        int qtdMeses= 0;
        float taxaSelic;
        float taxaReferencial;
        float somaTaxas = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você deseja investir? ");
        valorInicial = scan.nextDouble();
        System.out.println("Por quantos meses você deixará este valor rendendo na poupança? ");
        qtdMeses = scan.nextInt();
        System.out.println("Qual o valor da taxa SELIC? ");
        taxaSelic = scan.nextFloat();
        System.out.println("Qual o valor da taxa Referencial? ");
        taxaReferencial = scan.nextFloat();
//        System.out.println("O resultado do investimento inicial de " + valorInicial);

        float resultadoCalculaTaxa = calculaTaxa(taxaSelic, taxaReferencial, somaTaxas, valorInicial, qtdMeses);
        System.out.println("============================================================================");
        System.out.println("O investimento de " + valorInicial + " reais, por " + qtdMeses +
                " meses, renderá: "+ resultadoCalculaTaxa + "reais." );
        System.out.println("============================================================================");

    }
    public static float calculaTaxa(float taxaSelic, float taxaReferencial, float somaTaxas, double valorInicial, int qtdMeses){
//        DecimalFormat df = new DecimalFormat("#,###,###");
        System.out.println("============================================================================");
        if (taxaSelic < 8.5){
            taxaSelic = (float) ((taxaSelic * 0.7) / 12);
            System.out.println("TAXA SELIC EM %: "+ taxaSelic);
        }else{
            /**Se a SELIC estiver acima, a poupança rende 0.5% + Taxa Referencial (ao mês)
             valorInicial = (valorInicial * 0.5) / 12;
            System.out.println("TAXA RENDENDO NA POUPANÇA (SEM TAXA SELIC): " + valorInicial); **/
            taxaSelic = (float) ((taxaSelic * 0.5) / 12);
            System.out.println("TAXA SELIC EM %: " + taxaSelic);
        }

        //tirando taxa selic de porcentagem e transformando em decimal
        taxaSelic = taxaSelic / 100;
        //tirando TR de porcentagem e transformando em decimal
        taxaReferencial = taxaReferencial / 100;
        //Soma das taxas
        somaTaxas = (float) (taxaSelic + taxaReferencial);
        System.out.println("Soma de taxas: " + somaTaxas);

        /**SEM TAXA SELIC!!
         //tirando valor de porcentagem e transformando em decimal
         valorInicial = valorInicial / 100;
         somaTaxas = (float) (valorInicial + taxaReferencial);
         System.out.println("Soma de taxas: " + somaTaxas);
         SEM FERIR ESCOPO!!
         1.Como fazer a soma do valor inicial com a TR só quando entrar na segunda condição do if?
         2.Se definir as divisões da taxaSelic e valorIncial, em suas respectivas condições irá funcionar sem ferir o escopo?
         3.A soma de cada condição deverá ser contida dentro de cada if, para não imprimir as duas independente do caso usado.
         4.
        **/
        System.out.println("============================================================================");
//      CALCULANDO RENDIMENTO
        float resultadoRendimento;
//      M = C (1 + i * t)
        resultadoRendimento = (float) valorInicial * (1 + somaTaxas * qtdMeses);

        float totalRendimento = (float) (resultadoRendimento - valorInicial);
        System.out.println("TOTAL RENDIMENTO = " + totalRendimento);
        System.out.println("RENDIMENTO OBTIDO A CADA MÊS = " + totalRendimento / qtdMeses);
        return resultadoRendimento;
    }

}
