package bytebank;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    private static int totalClientes = 0;

    public Cliente(String nome, String cpf, String profissao){
        Cliente.totalClientes++;
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public static int getTotalClientes(){
        return Cliente.totalClientes;
    }
}
