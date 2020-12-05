/** The class implements a Player
*@param id 
*@param score
*/

public class Player {
    private final int id;
    private double score;
    
/*  The constructor */
    public Player(int id) {
        this.id = id;
        this.score = 0.0;
    }

/*  This function updates the score, add points to score */
    public void updateScore(double points) { this.score += points; }
    
/*  A function that @return the score*/
    public double getScore() { return this.score; }
    public int getId() { return this.id; }
}