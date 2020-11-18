import java.util.Scanner;

public class Player {
    private final int id;
    private double score;

    public Player(int id) {
        this.id = id;
        this.score = 0.0;
    }

    public int readAnswer() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt() - 1;

        return answer;
    }

    public void updateScore(double points) { this.score += points; }

}