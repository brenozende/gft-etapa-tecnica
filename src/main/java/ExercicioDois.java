import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        ICMS impostoIcms = new ICMS();
        IPI impostoIpi = new IPI();
        COFINS impostoCofins = new COFINS();

        double valorIcms = impostoIcms.calculaImposto(valor);
        double valorIpi = impostoIpi.calculaImposto(valor);
        double valorCofins = impostoCofins.calculaImposto(valor);
        double somatorio = valorCofins + valorIpi + valorIpi;

        System.out.println("Imposto ICMS: " + valorIcms);
        System.out.println("Imposto IPI: " + valorIpi);
        System.out.println("Imposto COFINS: " + valorCofins);
        System.out.println("Somatorio dos impostos: " + somatorio);
    }
}
