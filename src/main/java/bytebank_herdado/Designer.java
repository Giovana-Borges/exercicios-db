package bytebank_herdado;

public class Designer extends Funcionario{

    public Designer(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do Designer");
        return 200;
    }
}
