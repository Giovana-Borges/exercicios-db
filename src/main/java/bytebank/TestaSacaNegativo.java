package bytebank;

public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(101, 2020);
        conta.deposita(100);

        System.out.println(conta.saca(200));
        System.out.println(conta.getSaldo());

    }
}
