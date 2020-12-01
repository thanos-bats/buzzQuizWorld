import java.io.IOException;

public class Game {
    private final int numOfRounds = 4;
    private final int numOfQuestions = 4;

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
    }

    public void addPlayers(int num) {
        for (int i = 0; i < num; i++) {
            this.players[i] = new Player(i);
        }
    }

    public void initRound(int numRound) {
        this.rounds[numRound] = new Round(this.pool.getXQuestions(numOfQuestions),ui);
    }
}