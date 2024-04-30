package Quizz.controllers;

import java.util.Scanner;

import Quizz.entities.Player;
import Quizz.entities.Question;
import Quizz.repositories.QuestionRepository;
import Quizz.utils.EndGame;
import Quizz.utils.QuestionsTime;

public class GameControler {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do primeiro jogador: ");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name, 0);

        System.out.println("Nome do segundo jogador: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name, 0);

        System.out.println("Vamos começar o jogo! O jogador " + player1.getName() + " joga primeiro e depois " + player2.getName() + ".");

        Question[] questions = QuestionRepository.initializeQuestions();

        QuestionsTime.questionsTime(questions, player1, player2, scanner);

        EndGame.endGame(player1, player2);
    }
}
