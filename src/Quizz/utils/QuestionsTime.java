package Quizz.utils;

import java.util.Scanner;

import Quizz.entities.Question;
import Quizz.interfaces.InterfacePlayer;

public class QuestionsTime {
    public static void questionsTime(Question[] questions, InterfacePlayer player1, InterfacePlayer player2, Scanner scanner) {
        InterfacePlayer currentPlayer = player1;
        for (Question question : questions) {
            System.out.println("\n" + currentPlayer.getName() + ", responda à seguinte pergunta:");
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
    
            int chosenOption = 0;
            boolean validInput = false;
            do {
                System.out.print("Escolha uma opção: ");
                if (scanner.hasNextInt()) {
                    chosenOption = scanner.nextInt();
                    if (chosenOption >= 1 && chosenOption <= options.length) {
                        validInput = true;
                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e " + options.length + ".");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    scanner.next();
                }
            } while (!validInput);
    
            if (chosenOption == question.getCorrectAnswer()) {
                System.out.println("Resposta correta! Você ganhou 1 ponto.");
                currentPlayer.sumScore(1);
            } else {
                System.out.println("Resposta incorreta! A resposta correta era a opção " + question.getCorrectAnswer() + ": " + options[question.getCorrectAnswer() - 1]);
            }
    
            System.out.println("Pontuação atual de " + currentPlayer.getName() + ": " + currentPlayer.getScore());
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }    
}
