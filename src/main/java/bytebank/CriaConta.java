package bytebank;

public class CriaConta {
    public static void main(String[] args){
       boolean verificaSaque = false;
       boolean verificaTranferencia = false;

       //Instanciando primeira conta e relacionando ao primeiro cliente
       Conta primeiraConta = new Conta(01, 1312);
       Cliente primeiroCliente = new Cliente("primeiroCliente", "000.000.000-00", "criador");
       primeiraConta.deposita(200);
       primeiraConta.setTitular(primeiroCliente);

        System.out.println("==========================================");
        System.out.println("PRIMEIRA CONTA");
        System.out.println("SALDO: " + primeiraConta.getSaldo());
        System.out.println("AGENCIA: " + primeiraConta.getAgencia());
        System.out.println("NÚMERO: " + primeiraConta.getNumero());
        System.out.println("TITULAR: " + primeiraConta.getTitular().getNome());

        //Instanciando segunda conta e relacionando ao segundo cliente
        Conta segundaConta = new Conta(02, 1213);
        Cliente segundoCliente = new Cliente("segundoCliente", "999.999.999-99", "ajudante");
        segundaConta.deposita(100);
        segundaConta.setTitular(segundoCliente);

        System.out.println("==========================================");
        System.out.println("SEGUNDA CONTA");
        System.out.println("SALDO INICIAL: " + segundaConta.getSaldo());
        System.out.println("AGENCIA: " + segundaConta.getAgencia());
        System.out.println("NÚMERO: " + segundaConta.getNumero());
        System.out.println("TITULAR: " + segundaConta.getTitular().getNome());

        verificaSaque = segundaConta.saca(50);
        System.out.println("Sacando 50 reais => verificação: " + verificaSaque);
        System.out.println("SALDO ATUAL: " + segundaConta.getSaldo());

        System.out.println("==========================================");

        System.out.println("Transferindo 50 reais da segundaConta para primeiraConta");
        verificaTranferencia = segundaConta.transfere(50, primeiraConta);
        System.out.println("Verificando status da transferência: " + verificaTranferencia);
        System.out.println("SALDO ATUAL segundaConta: "+ segundaConta.getSaldo());
        System.out.println("SALDO ATUAL primeiraConta: "+ primeiraConta.getSaldo());

        System.out.println("==========================================");

        System.out.println("COMPARANDO REFERENCIAS");
        if(primeiraConta == segundaConta){
            System.out.println("Contas iguais.");
            System.out.println(primeiraConta);
            System.out.println(segundaConta);
        }else{
            System.out.println("Contas são diferentes!");
            System.out.println("Primeira conta: " + primeiraConta);
            System.out.println("Segunda conta: " + segundaConta);
        }

        System.out.println("==========================================");

        System.out.println("Total de contas criadas: " + Conta.getTotalContas());
        System.out.println("Total de cliente criados: " + Cliente.getTotalClientes());

    }
}
