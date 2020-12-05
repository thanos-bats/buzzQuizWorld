/** 
*This Class implements a question
*The question is consisted of
*@param String question
*@param String rightAnswer
*@param String Array of answers
*@param String  cateory
*/
import java.util.*;

public class Question {
    private final String question;
    private final String rightAnswer;
    private String[] answers;
    private final String category;

/*  The constructor */
    public Question(String question, String rightAnswer, String[] answers, String category) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.answers  = answers;
        this.category = category;
    }
/*  @return a question  */ 
    public String getQuestion() { return this.question; }
    
/*  @return a answer */
    public String getRightAnswer() { return this.rightAnswer; }
    
/*  @return a answers in random order  */
    public String[] suffleAnswers() {
        List<String> strList = Arrays.asList(this.answers);
        Collections.shuffle(strList);
        this.answers = strList.toArray(new String[strList.size()]);
        return this.answers;
    }
/*  @return answers */
    public String[] getAnswers() {
        return this.answers;
    }
/* @return category */
    public String getCategory() { return this.category; }

/*  The function which checks if the answer is correct
    @return boolean */
    public boolean checkRightAnswer(String answer) { return this.rightAnswer.equals(answer); }
}
