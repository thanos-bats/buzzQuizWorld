public class Round {

    protected static Question[] roundQuestions;
    protected static View ui;
    protected static double currentscore;
    
    public Round(Question[] q, View ui, double currentscore) {
        roundQuestions = q;
        Round.ui = ui;
        Round.currentscore = currentscore;
    }
}