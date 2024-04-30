package Quizz;
import java.util.Scanner;

public class QuestionsTime {
    public static void questionsTime(Question[] questions, Player player1, Player player2, Scanner scanner) {
        Player currentPlayer = player1;
        for (Question question : questions) {
            System.out.println("\n" + currentPlayer.getName() + ", responda à seguinte pergunta:");
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Escolha uma opção: ");
            int chosenOption = scanner.nextInt();

            if (chosenOption == question.getCorrectAnswer()) {
                System.out.println("Resposta correta! Você ganhou 1 ponto.");
                currentPlayer.sunScore(1);
            } else {
                System.out.println("Resposta incorreta! A resposta correta era a opção " + question.getCorrectAnswer() + ": " + options[question.getCorrectAnswer() - 1]);
            }

            System.out.println("Pontuação atual de " + currentPlayer.getName() + ": " + currentPlayer.getScore());
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}
