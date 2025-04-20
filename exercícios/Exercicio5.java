import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int pares = 0;

        System.out.println("Digite 10 valores para o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
    }
}