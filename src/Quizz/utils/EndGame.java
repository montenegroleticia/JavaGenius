package Quizz.utils;

import Quizz.interfaces.InterfacePlayer;

public class EndGame {
    public static void endGame(InterfacePlayer player1, InterfacePlayer player2) {
        System.out.println("\nPontuação final:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()){
            System.out.println(player1.getName() + " ganhou o jogo!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " ganhou o jogo!");
        } else {
            System.out.println("O jogo empatou!");
        }
    }
}
