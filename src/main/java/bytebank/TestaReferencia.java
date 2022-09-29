package bytebank;

public class TestaReferencia {
    public static void main(String[] args) {
        //DUAS REFERENCIAS DIFERENTES, APONTANDO PARA O MESMO OBJETO
        Conta primeiraConta = new ContaCorrente(000, 1111);
        Conta segundaConta = primeiraConta;

        //primeiraConta.getSaldo() = 300;
        System.out.println("SALDO PRIMEIRA CONTA: " +primeiraConta.getSaldo());
        System.out.println("SALDO SEGUNDA CONTA: " +segundaConta.getSaldo());

        if(primeiraConta == segundaConta){
            System.out.println("Contas iguais.");
            System.out.println(primeiraConta);
            System.out.println(segundaConta);
        }else{
            System.out.println("Contas são diferentes!");
            System.out.println(primeiraConta);
            System.out.println(segundaConta);
        }

        System.out.println("==========================================");

        System.out.println("Total de contas criadas: " + Conta.getTotalContas());
        System.out.println("SEGUNDA CONTA é uma referência para PRIMEIRA CONTA, portanto só há 1 conta instanciada!");
    }
}
