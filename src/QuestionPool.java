import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class QuestionPool {
    private ArrayList<Question> pool;

    public QuestionPool() throws IOException {
        pool = new ArrayList<>();
        this.initPool();
    }

    public void initPool() throws IOException {
        Path currentRelativePath = Paths.get("QuestionsFile.txt");
        File file = new File(currentRelativePath.toAbsolutePath().toString());
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine(); // this will read the first line

        String str= null;
        while ((str = br.readLine()) != null) {
            String[] line = str.split(",");
            pool.add(new Question(line[0], line[1], new String[] {line[2], line[3], line[4], line[5]}));
        }
    }

    public ArrayList<Question> getPool() {
        return this.pool;
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
}
