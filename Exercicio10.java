import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[15];
        float soma = 0, media;

        System.out.println("Digite as notas dos 15 alunos:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextFloat();
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.printf("Média geral: %.2f%n", media);
    }
}