import java.util.Random;

public class Exemplo05 {
    public static Random geradorAleat = new Random();

    public static void main(String[] args) {
        int somatorio = 0;
        for (int i = 1; i <= 10; i++) {
            int aleatorio = geradorAleat.nextInt(6) + 1;
            System.out.println(aleatorio);
            somatorio += aleatorio;
        }

        // Print the sum after the loop ends
        System.out.println("Somatório: " + somatorio);
    }
}
