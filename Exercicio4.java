import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];

        System.out.println("Digite 8 valores para o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores de X e Y (posições do vetor):");
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        System.out.println("Soma: " + (vetor[X] + vetor[Y]));
    }
}