import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] valores = new float[5];
        int posMaior = 0, posMenor = 0;

        System.out.println("Digite 5 valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextFloat();
        }

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > valores[posMaior]) {
                posMaior = i;
            }
            if (valores[i] < valores[posMenor]) {
                posMenor = i;
            }
        }

        System.out.println("Posição do maior: " + posMaior + ", Posição do menor: " + posMenor);
    }
}