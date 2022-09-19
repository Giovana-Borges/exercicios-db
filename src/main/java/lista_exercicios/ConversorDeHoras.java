package lista_exercicios;

import java.util.Scanner;

public class ConversorDeHoras {
    private  int totalSegundos;
    private int qtdHoras;
    private int qtdMinutos;
    private int qtdSegundos;

    public void setHoras(int totalSegundos) {
        qtdHoras = totalSegundos / 3600;
        //para pegar o resto da divisão
        totalSegundos = totalSegundos % 3600;
    }
    public int getHoras(){
        return qtdHoras;
    }

    public void setMinutos(int totalSegundos){
        qtdMinutos = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;
    }

    public int getMinutos(){
        return qtdMinutos;
    }

    public void setSegundos(int totalSegundo){
        qtdSegundos = totalSegundos % 60;
    }

    public int getSegundos(){
        return qtdSegundos;
    }

    public void mostraHoras(){
        System.out.println(getHoras() + ":" + getMinutos() + ":" + getSegundos());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os segundos para saber quanto equivale em horas: \n");
        int totalSegundos = scan.nextInt();

        int qtdHoras = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;

        int qtdMinutos = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;

        int qtdSegundos = totalSegundos;

       // System.out.println(mostraHoras());
        System.out.println(qtdHoras+ ":" + qtdMinutos+ ":" + qtdSegundos);



    }
}
