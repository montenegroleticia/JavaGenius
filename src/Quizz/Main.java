package Quizz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do primeiro jogador: ");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name, 0);

        System.out.println("Nome do segundo jogador: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name, 0);

        System.out.println("Vamos começar o jogo! O jogador " + player1.getName() + " joga primeiro e depois o " + player2.getName() + ".");

        Question[] questions = QuestionInitializer.initializeQuestions();

        QuestionsTime.questionsTime(questions, player1, player2, scanner);
    }
}
