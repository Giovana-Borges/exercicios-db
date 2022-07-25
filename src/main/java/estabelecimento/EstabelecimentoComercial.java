package estabelecimento;
import java.util.Calendar;

public class EstabelecimentoComercial {
    private String nome;
    private String endereco;
    private double horaFechado;
    private double horaAtual;
    private String telefone;
    private String website;

    public EstabelecimentoComercial(String nome, String endereco, double horaAtual, double horaFechado, String telefone, String website){
        this.nome = nome;
        this.endereco = endereco;
        this.horaAtual = horaAtual;
        this.horaFechado = horaFechado;
        this.telefone = telefone;
        this.website = website;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setHoraAtual(double horaAtual){

        this.horaAtual = horaAtual;
    }
    public double getHoraAtual(){
        return this.horaAtual;
    }

    public void setHoraFechado(double horaFechado){
        this.horaFechado = horaFechado;
    }
    public double getHoraFechado(){
        return this.horaFechado;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }

    public void setWebsite(String website){
        this.website = website;
    }
    public String getWebsite(){
        return this.website;
    }

    public boolean estabelecimentoFechado(double horaAtual, double horaFechado){
        horaAtual = 12.00;
        horaFechado = 18.00;
        if(horaAtual >= horaFechado){
            System.out.println("Está fechado");
        } else{
            System.out.println("Está aberto");
        }

        return false;
    }
}
