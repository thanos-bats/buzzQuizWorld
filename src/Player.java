/**
 * This class implements a Player
 * @param id is the identity of Player
 * @param score is the pointes the player has recieved
 */


public class Player {
    private final int id;
    private double score;

/*Constructo of the class */
    public Player(int id) {
        this.id = id;
        this.score = 0.0;
    }
    
/*This function updates the score, add points to score */
    public void updateScore(double points) { this.score += points; }
    
/*A function that @return the score*/
    public double getScore() { return this.score; }
    public int getId() { return this.id; }
}