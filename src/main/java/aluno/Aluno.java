package aluno;

public class Aluno implements Comparable<Aluno>{
        private String nome;
        private Integer nota;

    public Aluno(String nome, Integer nota){
            this.nome = nome;
            this.nota = nota;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getNome(){
            return this.nome;
        }

        public void setNota(Integer nota){
            this.nota = nota;
        }

        public Integer getNota(){
            return this.nota;
        }
// Ordenação por nota
        @Override public int compareTo(Aluno outroAluno) {
            if (this.nota > outroAluno.getNota()) {
                return -1;
            } if (this.nota < outroAluno.getNota()) {
                return 1;
            }
            return 0;

        }

}
