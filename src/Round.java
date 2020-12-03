import java.util.ArrayList;

public class Round {

    protected static Question[] roundQuestions;
    protected static View ui;
    
    public Round(Question[] q, View ui) {
        roundQuestions = q;
        Round.ui = ui;
    
    }

}