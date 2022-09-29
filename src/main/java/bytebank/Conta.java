package bytebank;

public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int totalContas = 0;

    public Conta(int agencia, int numero){
        Conta.totalContas++;
        System.out.println("Total de contas atualizado: " + Conta.totalContas);
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }
    public boolean saca(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalContas(){
        return Conta.totalContas;
    }
}
