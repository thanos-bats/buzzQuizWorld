import java.util.*;

public class Question {
    protected final String question;
    protected final String rightAnswer;
    protected String[] answers;
    protected String category;

    public Question(String question, String rightAnswer, String[] answers, String category) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.answers  = answers;
    }

    public String getQuestion() { return this.question; }

    public String getRightAnswer() { return this.rightAnswer; }

    public String[] getAnswers() {
        List<String> strList = Arrays.asList(this.answers);
        Collections.shuffle(strList);
        this.answers = strList.toArray(new String[strList.size()]);
        return this.answers;
    }

    public String getCategory() { return this.category; }

    public boolean checkRightAnswer(String answer) { return this.rightAnswer.equals(answer); }
}
