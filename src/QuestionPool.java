/**
*Class QuestionPool imprements a pool of Questions
*QuestionPool includes an Array of Question and inits it with the questions
*@param pool Arrayslist of Questions
*/

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;


public class QuestionPool {
    private ArrayList<Question> pool;

/*  The constructor */
    public QuestionPool() throws IOException {
        pool = new ArrayList<>();
        this.initPool();
    }

/*  InitPool is a function which fills the Question Array with questions from the external txt file */
    public void initPool() throws IOException {
        Path currentRelativePath = Paths.get("QuestionsFile.txt");
        File file = new File(currentRelativePath.toAbsolutePath().toString());
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine(); // this will read the first line

        String str;
        while ((str = br.readLine()) != null) {
            String[] line = str.split(",");
            pool.add(new Question(line[0], line[5], new String[] {line[1], line[2], line[3], line[4]}, line[6]));
        }
    
    }
/*  @return the Arraylist of Question */
    public ArrayList<Question> getPool() {
        return this.pool;
    }

/*  @return random Questions from the pool */
    public Question getRandomQuestion() {
        Question randomQ;
        Random rn = new Random();
        int randint = Math.abs(rn.nextInt()) % (pool.size() - 1);
        randomQ =  pool.get(randint);
        this.deleteQuestion(randint);
        return randomQ;
    }

/*  @return an Question array with X Questions */
    public Question[] getXQuestions(int num) {
        Question[] q = new Question[num];
        for (int i = 0; i < num; i++) {
            q[i] = this.getRandomQuestion();
        }
        return  q;
    }

/*  Deletes a Question from the pool */
    public void deleteQuestion(int i) {
        this.pool.remove(i);
    }
}
