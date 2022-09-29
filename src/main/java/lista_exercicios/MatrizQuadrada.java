package lista_exercicios;

import java.util.Random;

public class MatrizQuadrada {
    public static void main(String[] args){
        int [][] matriz = new int[5][5];

        System.out.println("Matriz quadrada 5x5 de números aleatórios \n");
        int criaMatriz = geraMatrizQuadrada(matriz);
        System.out.println(criaMatriz);

        int imprimeMatriz = imprimeMatriz(matriz);
        System.out.println(imprimeMatriz);

    }
    public static int geraMatrizQuadrada(int[][] matriz){
        Random ale =new Random();
        int i = 0;
        int j = 0;

        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz.length; j++){
                matriz[i][j]= ale.nextInt(99-10+1)+10;
            }
        }

        return matriz[i][j];
    }

    public static int imprimeMatriz(int[][]matriz){
        String imprimir = "";
        int i = 0;
        int j = 0;
        geraMatrizQuadrada(matriz);
            for (i = 0; i < matriz.length; i++){
                for  (j = 0; j < matriz.length; j++) {
                    imprimir = imprimir + "| " + matriz[i][j];
                }
                imprimir = imprimir + "|\n";
            }
            //return imprimir?
        return matriz[i][j];
    }

    public static int calculaDiagonalPrincipal(int[][] matriz) {
        int dp = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    dp = dp + matriz[i][j];
                }
            }
        }
        return dp;
    }
}
