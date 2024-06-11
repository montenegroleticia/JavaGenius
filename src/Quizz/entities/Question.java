package Quizz.entities;

import Quizz.interfaces.InterfaceQuestion;

public class Question implements InterfaceQuestion {
    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String[] getOptions() {
        return options;
    }

    @Override
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
