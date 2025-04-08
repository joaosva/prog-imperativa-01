import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] valores = new float[5];
        float maior, menor, soma = 0, media;

        System.out.println("Digite 5 valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextFloat();
            soma += valores[i];
        }

        maior = menor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        media = soma / valores.length;

        System.out.print("Valores lidos: ");
        for (float valor : valores) {
            System.out.printf("%.2f ", valor);
        }
        System.out.printf("%nMaior: %.2f, Menor: %.2f, Média: %.2f%n", maior, menor, media);
    }
}