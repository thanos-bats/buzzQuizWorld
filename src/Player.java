

public class Player {
    public int num;
    public int CorrectAnswers;
    public int HighScore;
    /*for multiplayer*/
    public int wins;

    
    public Player(int num) {
        this.num = num; 
        this.CorrectAnswers = 0;

    }
}