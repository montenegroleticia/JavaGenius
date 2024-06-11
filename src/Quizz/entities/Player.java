package Quizz.entities;

import Quizz.interfaces.InterfacePlayer;

public class Player extends Person implements InterfacePlayer {
    private int score;

    public Player(String name, int score) {
        super(name);
        this.score = score;   
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void sumScore(int score) {
        this.score += score;
    }
}
