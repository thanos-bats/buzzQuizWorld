import java.util.ArrayList;


public class QuestionPool {
    private ArrayList<Question> pool;

    public QuestionPool() {
        this.pool = new ArrayList<Question>();
    }

    public void addQuestion() {

        
        pool.add(new Question("Which year Aris fc played at UCL",
                                    0,
                                    new String[] {"Never","1982","1244","2019"}));
    }

}
