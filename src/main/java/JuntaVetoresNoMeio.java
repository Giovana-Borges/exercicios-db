import java.util.Random;

public class JuntaVetoresNoMeio {
    public static void main(String[] args) {
        int tam = 20;
        int vetorAuxiliar[] = new int [tam];
        int vetorFinal[] = new int [tam];

        Random aleatorio = new Random();

        int source_arr[], auxiliarPos, dest_arr[], finalPos, totalNumerosCopiados;
        source_arr = vetorAuxiliar;
        //indica a partir de que índice o totalDenNumeros do vetorAuxiliar deve ser copiado
        auxiliarPos = 0;
        dest_arr = vetorFinal;
        //posição onde os números de vetorAuxiliar serão copiados dentro do vetoFinal
        finalPos = 5;
        //quantidade de numeros que serão copiados do vetorAuxiliar para dentro do vetorFinal
        totalNumerosCopiados = 5;

        // Print elements of source
        System.out.print("source_arr : ");
        for (int i = 0; i < vetorAuxiliar.length; i++) {
            vetorAuxiliar[i] = aleatorio.nextInt(tam);
            System.out.print(vetorAuxiliar[i] + " ");
        }
        System.out.println("");

        System.out.println("auxiliarPos : " + auxiliarPos);

        // Print elements of source
        System.out.print("dest_arr : ");
        for (int i = 0; i < vetorFinal.length; i++) {
            vetorFinal[i] = aleatorio.nextInt(tam);
            System.out.print(vetorFinal[i] + " ");
        }
        System.out.println("");

        System.out.println("finalPos : " + finalPos);

        System.out.println("totalNumerosCopiados : " + totalNumerosCopiados);

        // Use of arraycopy() method
        System.arraycopy(source_arr, auxiliarPos, dest_arr,
                finalPos, totalNumerosCopiados);

        // Print elements of destination after
        System.out.print("final dest_arr : ");
        for (int i = 0; i < vetorFinal.length; i++)
            System.out.print(vetorFinal[i] + " ");
    }

    public static void arraycopy(Object source_arr, int auxiliarPos, Object dest_arr, int finalPos, int totalNumerosCopiados){

    }
}
