import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];

        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        System.out.println("Valores lidos na ordem inversa:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}