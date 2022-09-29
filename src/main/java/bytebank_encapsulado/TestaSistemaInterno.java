package bytebank_encapsulado;

public class TestaSistemaInterno {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Gerente gerente = new Gerente("gerente1", "000.000.000-00", 5000.00);

        Designer designer = new Designer("designer1", "111.111.111-11", 3000.00);

        SistemaInterno sistemaInterno = new SistemaInterno();

        //cliente não tem construtor, assim ele não atribui valor à senha
        System.out.print("Autenticação de cliente: ");
        sistemaInterno.autentica(cliente);
        System.out.print("Autenticação de gerente: ");
        sistemaInterno.autentica(gerente);
    }
}
