// Instructions
// Utilizando a classe Random do Java para gerar números aleatórios, faça um programa que simule um jogo de dados entre 2 jogadores.

// O jogo consiste de 10 rodadas.
// Em cada rodada, o programa gera 2 números aleatórios (entre 1 e 6), um para cada jogador. O jogador com o maior número vence a rodada e ganha 1 ponto.
// Ao final de 10 rodadas, o jogador que tiver mais pontos ganha o jogo.
// OBS: pode haver empate.

// A entrega desta atividade deve ser realizada anexando o arquivo .java do seu código e uma imagem mostrando a execução do seu programa.

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
