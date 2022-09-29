package bytebank_herdado;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario giovana = new Gerente("Giovana", "111.111.111-11", 1500.00);
        System.out.println("Criando 1º Funcionario");
        System.out.println("Nome: " + giovana.getNome());
        System.out.println("CPF: " + giovana.getCpf());
        System.out.println("Salário: " + giovana.getSalario());
        System.out.println("Bonficação: " + giovana.getBonificacao());



    }
}
