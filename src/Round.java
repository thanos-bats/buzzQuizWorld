/** 
*Round Class implements Round of Questions
*@param roundQuestions array of Question for the current round
*@param ui an interface
*@param currentscore 
*/

public class Round {

    protected static Question[] roundQuestions;
    protected static View ui;
    protected double currentscore;
    
/*  The constructor  */
    public Round(Question[] q, View ui, double currentscore) {
        roundQuestions = q;
        Round.ui = ui;
        this.currentscore = currentscore;
    }
}