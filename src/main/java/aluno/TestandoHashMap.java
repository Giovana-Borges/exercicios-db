package aluno;
import java.util.HashMap;

public class TestandoHashMap {

    // Qual tipo de retorno? Como organizar alunos por nota?
//        public Object alunosPorNota(List<Aluno> alunos) {
    // Nota 10: Alice, Arthur
    // Nota 9: Cassiane, Karina
    // Nota 8: Samuel
    // Nota 7:
    // Nota 6: Jaqueline, Juliana, Jonathan, Jeferson
//            return null;
//        }
    public static void main(String[] args){
        HashMap<Integer,String> notaAluno = new HashMap<Integer,String>();

        notaAluno.put(1, "Alice");
        notaAluno.put(2, "Arthur");
        notaAluno.put(3, "Cassiane");
        notaAluno.put(4, "Karina");
        notaAluno.put(5, "Samuel");
        notaAluno.put(6, "Jaqueline");
        notaAluno.put(7, "Juliana");
        notaAluno.put(8, "Jonathan");
        notaAluno.put(9, "Jeferson");

        //System.out.println(notaAluno);
        for(int i = 1; i < notaAluno.size()+1; i++){
            System.out.println(notaAluno.get(i));
        }
    }
}