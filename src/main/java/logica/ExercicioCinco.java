package logica;
import java.util.Scanner;
public class ExercicioCinco {
    /*Imagine que você é uma pessoa capitã de um barco e você precisa calcular se a sua
      viagem será bem sucedida. Você tem dois parâmetros numéricos inteiros, ouro e
      piratas. Você terá sucesso na viagem se a quantidade de ouro for maior que a
      quantidade de piratas. Mas se a soma de ouro e piratas for maior que 100, o navio
      afunda. Retorne true se a viagem tiver sucesso e false se falhar.
     */
    public static void main(String[] args){
        int ouro;
        int piratas;
        int somaOuroPiratas = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a quantidade de ouro que você levará na viagem?");
        ouro = teclado.nextInt();
        System.out.println("Quantos piratas irão nesta viagem?");
        piratas = teclado.nextInt();


        boolean verificaSucessoViagem = viagemBemSucedida(ouro, piratas, somaOuroPiratas);
        System.out.println(verificaSucessoViagem);
    }
    public static boolean viagemBemSucedida(int ouro, int piratas, int somaOuroPiratas){
        somaOuroPiratas = ouro + piratas;

        if( ouro > piratas && somaOuroPiratas <= 100){
            System.out.println("Viagem bem sucedida");
            return true;
        }
        System.out.println(somaOuroPiratas);
        //retornará falso quando a quantidade de ouro for maior que a de piratas e quando a soma for maior que 100
        return false;
    }
}
