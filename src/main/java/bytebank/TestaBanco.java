package bytebank;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente giovana = new Cliente("Giovana Borges", "222.222.222-22", "programador");


        Conta contaGiovana = new Conta(03,1412);
        contaGiovana.deposita(100);

        //associa cliente giovana à conta contaGiovana
        contaGiovana.setTitular(giovana);

        System.out.println(contaGiovana.getTitular());
        System.out.println(giovana);
        System.out.println(contaGiovana.getTitular().getNome());

        System.out.println("==========================================");

        //Criando cliente assim que titular da conta for acessado
        Conta contaTeste = new Conta(04,1214);
        contaTeste.setTitular(new Cliente("Testador", "111.111.111-11", "testando"));

        System.out.println(contaTeste.getTitular());
        System.out.println("Acessando nome do titular da contaTeste: " + contaTeste.getTitular().getNome());

        //Alterando nome do objeto previamente instanciado com seu construtor já recebendo um nome
        contaTeste.getTitular().setNome("TESTE");
        System.out.println("Acessando nome do titular da contaTeste: " + contaTeste.getTitular().getNome());

        System.out.println("==========================================");

        System.out.println("Total de contas criadas: " + Conta.getTotalContas());
        System.out.println("Total de cliente criados: " + Cliente.getTotalClientes());

    }
}
