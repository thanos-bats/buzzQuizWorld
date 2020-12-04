public class Round {

    protected static Question[] roundQuestions;
    protected static View ui;
    protected double currentscore;
    
    public Round(Question[] q, View ui, double currentscore) {
        roundQuestions = q;
        Round.ui = ui;
        this.currentscore = currentscore;
    }
}