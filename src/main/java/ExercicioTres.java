import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso = input.nextDouble();
        double valor = input.nextDouble();
        int distancia = input.nextInt();

        //Calcular frete para vagão e caminhão

        Carga carga = new Carga();
        carga.setPeso(peso);
        carga.setValor(valor);

        Vagao vagao = new Vagao(carga);
        Caminhao caminhao = new Caminhao(carga);

        System.out.println("Valor do frete para Vagao: " + vagao.calculaFrete(distancia));
        System.out.println("Valor do frete para Caminhao: " + caminhao.calculaFrete(distancia));
    }
}
