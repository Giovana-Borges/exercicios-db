package conversor_de_horas;

public class ConversorHorasTest {
    public static void main(String[] args) {
        ConversorHoras conversor1 = new ConversorHoras(5055);
        System.out.println("==================================");

        System.out.println("CONVERSOR");
        System.out.println("Segundos passados na instanciação: ");
        conversor1.imprime();
        System.out.println();
        System.out.println("Segundos passados pelo método set: ");
        conversor1.setTotalSegundos(7023);
        conversor1.imprime();

        System.out.println("==================================");

    }
}
