import java.util.Random;

public class Atvd02 {

    public static void main(String[] args) {
        Random random = new Random(); 

        int pontosJogador1 = 0; 
        int pontosJogador2 = 0; 

        for (int i = 1; i <= 10; i++) {
            int Jogador1 = random.nextInt(6) + 1;
            int Jogador2 = random.nextInt(6) + 1;

            System.out.println("Rodada " + i + ":");
            System.out.println("Jogador 1 jogou: " + Jogador1);
            System.out.println("Jogador 2 jogou: " + Jogador2);

            if (Jogador1 > Jogador2) {
                pontosJogador1++;
                System.out.println("Jogador 1 ganhou!\n");
            } else if (Jogador2 > Jogador1) {
                pontosJogador2++;
                System.out.println("Jogador 2 ganhou!\n");
            } else {
                System.out.println("Deu empate!\n");
            }
        }

       
        System.out.println("Fim do jogo!");
        System.out.println("Pontuação final:");
        System.out.println("Jogador 1: " + pontosJogador1);
        System.out.println("Jogador 2: " + pontosJogador2);

        if (pontosJogador1 > pontosJogador2) {
            System.out.println("Jogador 1 venceu o jogo!");
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("Jogador 2 venceu o jogo!");
        } else {
            System.out.println("deu empate!");
        }
    }
}
