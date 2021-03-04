import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        int numero;
        int maiorNumero = 0;
        int menorNumero = 0;
        int eval = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Numero " + (i+1) + ": ");
            Scanner input = new Scanner(System.in);
            numero = input.nextInt();
            if (i == 0){
                maiorNumero = numero;
                menorNumero = numero;
                eval++;
            }
            else {
                if (maiorNumero < numero) {
                    maiorNumero = numero;
                }
                else if (menorNumero > numero) {
                    menorNumero = numero;
                }
                else {
                    eval++;
                }
            }
        }
        if(eval == 5) {
            System.out.println("Os 5 numeros sao iguais");
        }
        else {
            System.out.printf("Maior numero: %d\n", maiorNumero);
            System.out.printf("Menor numero: %d\n", menorNumero);
        }
    }
}
