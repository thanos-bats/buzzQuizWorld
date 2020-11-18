import java.util.ArrayList;

public class Round {
    private Question[] roundQuestions;

    public Round(int numberOfQuestions, QuestionPool pool ) {
        this.roundQuestions = new Question[numberOfQuestions];
    }

    public void initQuestions(Question[] q) {
        roundQuestions = q;
    }

}