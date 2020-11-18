import java.util.ArrayList;
import java.util.Random;


public class QuestionPool {
    public ArrayList<Question> pool;

    public QuestionPool() {
        this.pool = new ArrayList<>();
        this.initPool();
    }

    public Question getRandomQuestion() {
        Question randomQ;
        Random rn = new Random();
        int randint = Math.abs(rn.nextInt()) % (pool.size() - 1);
        randomQ =  pool.get(randint);
        this.deleteQuestion(randint);
        return randomQ;
    }

    public Question[] getXQuestions(int num) {
        Question[] q = new Question[num];
        for (int i = 0; i < num; i++) {
            q[i] = this.getRandomQuestion();
        }
        return  q;
    }

    public void deleteQuestion(int i) {
        this.pool.remove(i);
    }

    public void initPool() {
        pool.add(new Question("Who was the legendary Benedictine monk who invented champagne?",
                    "Dom Perignon",
                                new String[] {"Dom Perignon","Brandley James","Alice Cooper","Maria Alisson"}));

        pool.add(new Question("Name the largest freshwater lake in the world?",
                    "Lake Superior",
                                new String[] {"Lake Kerkini","Caspian sea","Lake Superior","Lake Victoria"}));
    
        pool.add(new Question("Where would you find the Sea of Tranquility?",
                    "In Asia",
                                new String[] {"In Asia","The Earth","The Mars","The Moon"}));
        
        pool.add(new Question("What is someone who shoes horses called?",
                    "A farrier",
                                new String[] {"A farrier","A human","A painter","A farmer"}));

        pool.add(new Question("What kind of weapon is a falchion?",
                    "A Rpg",
                                new String[] {"A BB Gun","A Fire Gun","A Rpg","A sword"}));
                                
        pool.add(new Question("Name the seventh planet from the sun.",
                    "Mars",
                                new String[] {"Zeus","Mars","Uranus","Aphrodite"}));

        pool.add(new Question("Which is the Capital city of Argentina?",
                    "Buenos Aires",
                                new String[] {"Paris","Buenos Aires","Madrit","Oslo"}));
                               
        pool.add(new Question("Which is the biggest island of Greece",
                    "Creta",
                                new String[] {"Creta","Rhodes","Evoia","Lesvos"}));

        pool.add(new Question("When Liverpool won UCL last time?",
                    "2019",
                                new String[] {"1998","1982","2019","2016"}));

        pool.add(new Question("Which is the most populated country in the world?",
                    "China",
                                new String[] {"India","Bagladesh","China","Thailand"}));
     }

}
