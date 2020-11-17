import java.util.ArrayList;


public class Question {
    private final String question;
    private final int rightAnswerIdx;
    private final String[] answers;

    public Question(String question, int rightAnswerIdx, String[] answers) {
        this.question = question;
        this.rightAnswerIdx = rightAnswerIdx;
        this.answers  = answers;
    }

    public String getQuestion() {
        return this.question;
    }

    public int getRightAnswerIdx() {
        return this.rightAnswerIdx;
    }

    public String[] getAnswers() {
        return this.answers;
    }
}
