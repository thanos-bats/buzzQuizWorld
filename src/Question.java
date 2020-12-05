/** 
*This Class implements a question
*The question is consisted of a String which is the question, a String which is the answer , a String Array of the answers
 and a String for the cateory.
*/
import java.util.*;

public class Question {
    private final String question;
    private final String rightAnswer;
    private String[] answers;
    private final String category;

/*  The constructor of the class  */
    public Question(String question, String rightAnswer, String[] answers, String category) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.answers  = answers;
        this.category = category;
    }
/*  Getters function which @return the variables of the Question class  */ 
    public String getQuestion() { return this.question; }

    public String getRightAnswer() { return this.rightAnswer; }

    public String[] suffleAnswers() {
        List<String> strList = Arrays.asList(this.answers);
        Collections.shuffle(strList);
        this.answers = strList.toArray(new String[strList.size()]);
        return this.answers;
    }

    public String[] getAnswers() {
        return this.answers;
    }

    public String getCategory() { return this.category; }

/*  The function which checks if the answer of player is the correct answer
    @return boolean */
    public boolean checkRightAnswer(String answer) { return this.rightAnswer.equals(answer); }
}
