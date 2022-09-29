package bytebank;

public class TestaAutenticavel {
    public static void main(String[] args) {
        Conta contaTeste = new ContaCorrente(04, 1010);
        Cliente clienteNovo = new Cliente("Cliente novo", "000.000.000-00", "teste");
        clienteNovo.setSenha(2020);
        int senhaClienteNovo = clienteNovo.getSenha();
        System.out.println(senhaClienteNovo);
        System.out.println(clienteNovo.autentica(senhaClienteNovo));
    }
}
