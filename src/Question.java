import java.util.*;

public class Question {
    private final String question;
    private final String rightAnswer;
    private String[] answers;

    public Question(String question, String rightAnswer, String[] answers) {
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

    public boolean checkRightAnswer(String answer) { return this.answers.equals(answer); }
}
