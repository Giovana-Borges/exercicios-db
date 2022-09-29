package bytebank_encapsulado;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Gio", "222.222.222-22", -5000.0);

        System.out.println("Criando 1º Funcionario do tipo Gerente");
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCpf());
        System.out.println("Salário: " + gerente1.getSalario());
        System.out.println("Bonficação: " + gerente1.getBonificacao());


    }
}
