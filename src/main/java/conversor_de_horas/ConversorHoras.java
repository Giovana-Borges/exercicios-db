package conversor_de_horas;

public class ConversorHoras {
    private int totalSegundos;
    private int qtdHoras;
    private int qtdMinutos;
    private int qtdSegundos;

    public ConversorHoras(int totalSegundos) {
        setTotalSegundos(totalSegundos);
    }

    public int getTotalSegundos() {
        return totalSegundos;
    }

    public void setTotalSegundos(int totalSegundos) {
        this.totalSegundos = totalSegundos;
        converteHorario();
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public int getQtdMinutos() {
        return qtdMinutos;
    }

    public int getQtdSegundos() {
        return qtdSegundos;
    }

    public void imprime() {
        System.out.println("Total de segundos: " + getTotalSegundos());
        System.out.println("Horário convertido: " + getQtdHoras() + ":" + getQtdMinutos() + ":" + getQtdSegundos());
    }

    private void converteHoras() {
        this.qtdHoras = getTotalSegundos() / 3600;
    }

    private void converteMinutos() {
        this.qtdMinutos = totalSegundos % 3600 / 60;
    }

    private void converteSegundos() {
        this.qtdSegundos = totalSegundos % 3600 % 60;
    }

    private void converteHorario() {
        converteHoras();
        converteMinutos();
        converteSegundos();
    }
}
