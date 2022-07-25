package logica;

public class ExercicioSeis {
    public static void main(String[] args) {
	/*Printe meio triângulo. Com 15 linhas, cada linha deve ter um asterisco a mais do que
	 a linha de cima. A primeira linha começa com 1 asterisco. */

        int i, j;

        for(i = 1; i <= 15; i++) {
            for(j = 15 - i; j >= 1; j--) {             //imprimir os espaços
                System.out.printf(" ");
            }
            for(j = 1; j <= i; j++) {                 //imrprimir os asteríscos
                System.out.printf("*");
            }
            System.out.printf("\n");
        }


    }

}

