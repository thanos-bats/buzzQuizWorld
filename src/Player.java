

public class Player {
    private int id;
    private int CorrectAnswers;
    private int HighScore;
    /*for multiplayer*/
    private int wins;

    
    public Player(int id) {
        this.id = id;
        this.CorrectAnswers = 0;
    }
}