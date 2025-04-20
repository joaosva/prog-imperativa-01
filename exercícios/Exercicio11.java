import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] vetor = new float[10];
        int negativos = 0;
        float somaPositivos = 0;

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextFloat();
            if (vetor[i] < 0) {
                negativos++;
            } else {
                somaPositivos += vetor[i];
            }
        }

        System.out.println("Quantidade de negativos: " + negativos);
        System.out.printf("Soma dos positivos: %.2f%n", somaPositivos);
    }
}