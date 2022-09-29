package lista_exercicios;

import java.util.Random;

public class TestMatrizQuadrada {
        public static void main(String[] args){
            Random ale = new Random();

            int [] [] matriz = new int [5] [5];
            int dp = 0;
//        boolean controle;

            for (int i = 0; i < matriz.length; i++){
                for  (int j = 0; j < matriz.length; j++){
                    matriz [i][j] = ale.nextInt(99-10+1)+10;
                }
            }
            System.out.println("Matriz quadrada 5x5 de números aleatórios \n");

            String imprimir = "";
            for (int i = 0; i < matriz.length; i++){
                for  (int j = 0; j < matriz.length; j++) {
                    imprimir = imprimir + "| " + matriz[i][j];
                }
                imprimir = imprimir + "|\n";
            }
            System.out.println(imprimir);

            System.out.println("Somando a diagonal principal da matriz");

            for (int i = 0; i < matriz.length; i++){
//            controle = true;
                for  (int j = 0; j < matriz.length; j++) {
                    if (i == j) {
                        dp = dp + matriz[i][j];
//                controle = false;
                    } //como fazer a soma mostrar só o resultado final?
                }
//            if (controle) {
//                break;
//            }
                System.out.println("A soma da diagonal principal é: " + dp);
            }
        }

    }
