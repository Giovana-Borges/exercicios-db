package bytebank;

public class TestaBanco {
    public static void main(String[] args) {
        //Integrando referencia de Conta e Cliente no momento da instanciação

        Conta contaGiovana = new ContaCorrente(03,1412);

        contaGiovana.setTitular(new Cliente("Giovana Borges", "222.222.222-22", "programador"));
        contaGiovana.deposita(100);
        System.out.println("Acessando nome do titular da conta: " + contaGiovana.getTitular().getNome());
    }
}
