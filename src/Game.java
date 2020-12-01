import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Game {
    private final int numOfRounds = 4;
    private final int numOfQuestions = 4;

    private View ui;
    private QuestionPool pool;
    private Player[] players;
    private Round[] rounds;


    public Game(View ui) throws IOException, ClassNotFoundException {
        this.ui = ui;
        pool = new QuestionPool();

        players = new Player[1];
        this.addPlayers(1);

        rounds = new Round[numOfRounds];
        //play();
    }
    /*public void play() throws ClassNotFoundException {
        int gameRound = 0;
        String[] roundType = {"Clasic", "Time", "Bet"};
        do {
            Random rn = new Random();
            int randint = Math.abs(rn.nextInt()) % (roundType.length);
            //Class<?> classType = Class.forName(roundType[randint]);
            //System.out.println(classType.getClass());
            gameRound++;
        } while (gameRound < numOfRounds);
    } */

    public void addPlayers(int num) {
        for (int i = 0; i < num; i++) {
            this.players[i] = new Player(i);
        }
    }

    public void initRound(int numRound) {
        this.rounds[numRound] = new Round(this.pool.getXQuestions(numOfQuestions));
    }

}