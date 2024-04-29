package Quizz;

public class Player extends Person {
    private int score;

    public Player(String name, int score) {
        super(name);
        this.score = score;   
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
   
    public void sunScore(int score) {
        this.score += score;
    }
}
