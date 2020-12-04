import java.util.Scanner;

public class Player {
    private final int id;
    private double score;

    public Player(int id) {
        this.id = id;
        this.score = 0.0;
    }

    public void updateScore(double points) { this.score += points; }

    public double getScore() {return this.score;}


}