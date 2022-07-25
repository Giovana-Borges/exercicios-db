package aluno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlunoService extends Aluno{

    Aluno aluno1 = new Aluno("Alice", 10);
    Aluno aluno2 = new Aluno("Arthur", 10);
    Aluno aluno3 = new Aluno("Cassiane", 9);
    Aluno aluno4 = new Aluno("Karina", 9);
    Aluno aluno5 = new Aluno("Samuel", 8);
    Aluno aluno6 = new Aluno("Jaqueline", 6);
    Aluno aluno7 = new Aluno("Juliana", 6);
    Aluno aluno8 = new Aluno("Jonathan", 6);
    Aluno aluno9 = new Aluno("Jeferson", 6);

    public AlunoService(String nome, Integer nota) {
        super(nome, nota);
    }


    // Qual tipo de retorno? Como organizar alunos por nota?
    public Object alunosPorNota() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);
        alunos.add(aluno8);
        alunos.add(aluno9);

        System.out.println(alunos);
        Collections.sort(alunos);

        return null;
    }

}
