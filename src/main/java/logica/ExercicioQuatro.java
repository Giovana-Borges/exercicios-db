package logica;

public class ExercicioQuatro {
    // Dada uma lista de bibliotecas, retorne:
    //"A", se o total de livros for maior ou igual a 1 e menor que 10
    //"B", se o total for maior ou igual a 10 e menor que 20
    //"C" se o número for maior ou igual 20 e menor que 30
    //"Z", se o número for igual a 0
    public static void main(String[] args){
        int totalDeLivros = 0;
        String [] listaDeBibliotecas = new String[4];
        listaDeBibliotecas [0] = "Biblioteca Municipal";
        listaDeBibliotecas [1] = "Biblioteca Pública";
        listaDeBibliotecas [2] = "Biblioteca Erico Veríssimo";
        listaDeBibliotecas [3] = "Biblioteca da UFRGS";

        for(String lista : listaDeBibliotecas ){
            System.out.println(lista);
        }
//         Como integrar valor a uma variável de uma lista?
//        "Biblioteca Municipal" = String.valueOf(livros == 10);


        if(totalDeLivros >= 1 && totalDeLivros < 10){
            System.out.println("A");
        }else if(totalDeLivros >= 10 && totalDeLivros < 20){
            System.out.println("B");
        }else if (totalDeLivros>= 20 && totalDeLivros <30){
            System.out.println("C");
        }else if (totalDeLivros == 0){
            System.out.println("Z");
        }

    }
}
