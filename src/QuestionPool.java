import java.util.ArrayList;


public class QuestionPool {
    private ArrayList<Question> pool;

    public QuestionPool() {
        this.pool = new ArrayList<Question>();
    }

    public void addQuestion() {
        Question q1 = new Question("dskjsd", 1, "fdbdfb");
        pool.add(q1);
        Question q2 = new Question("Who was the legendary Benedictine monk who invented champagne?", 1, "Dom Perignon Brandley James Alice Cooper Maria Alisson");
        pool.add(q2);
    }


}
