package bytebank_encapsulado;

public class EditorVideo extends Funcionario {

    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Editor de Vídeo");
        return 150;
    }
}
