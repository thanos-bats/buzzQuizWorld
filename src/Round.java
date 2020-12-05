/** 
*Round Class implements a new Round of Questions
*Class accept as a definition an Array of Question, a View Ui and a variable integer for the current score
 */

public class Round {

    protected static Question[] roundQuestions;
    protected static View ui;
    protected double currentscore;
    
/*  Constructor of the class */
    public Round(Question[] q, View ui, double currentscore) {
        roundQuestions = q;
        Round.ui = ui;
        this.currentscore = currentscore;
    }
}