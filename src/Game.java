import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Game {
    private final int numOfRounds = 2;
    private final int numOfQuestions = 1;

    private View ui;
    private QuestionPool pool;
    private Player[] players;
    private Round[] rounds;


    public Game(View ui) throws IOException {
        this.ui = ui;
        pool = new QuestionPool();

        players = new Player[1];
        this.addPlayers(1);

        rounds = new Round[numOfRounds];
        play();
    }

    public void play() {
        int gameRound = 0;
        Map<Integer, String> roundType = new HashMap<>();
        roundType.put (1, "ClassicRound");
           roundType.put (2, "BetRound");
        do {
            Random rn = new Random();
            int randint = Math.abs(rn.nextInt()) % (roundType.size());
            //Class<?> cls = Class.forName(roundType[randint]);
            //Constructor<?> ctor = cls.getConstructor(String.class);
            //Object object = ctor.newInstance(new Object[] { pool.getXQuestions(numOfQuestions), ui, players[0].getScore() });
            if (roundType.get(randint) == "ClassicRound") {
                rounds[gameRound] = new ClassicRound(pool.getXQuestions(numOfQuestions), ui, players[0].getScore());
            }
            else if (roundType.get(randint) == "BetRound") {
                rounds[gameRound] = new BetRound(pool.getXQuestions(numOfQuestions), ui, players[0].getScore());
            }

            gameRound++;
        } while (gameRound < numOfRounds);
    }

    public void addPlayers(int num) {
        for (int i = 0; i < num; i++) {
            this.players[i] = new Player(i);
        }
    }
}