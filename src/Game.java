
public class Game {     
    private Player[] players;
    private Round[] rounds;
    private QuestionPool pool;


    public Game(int numberOfPlayers,int numberOfRounds, int numberOfQuestions) {
        pool = new QuestionPool();

        players = new Player[numberOfPlayers];
        this.addPlayers(numberOfPlayers);

        rounds = new Round[numberOfQuestions];

    }

    public void addPlayers(int num) {
        for (int i = 0; i < num; i++) {
            this.players[i] = new Player(i);
        }
    }

    public void initRound(int numRound) {
        this.rounds[numRound] = new Round(this.pool.getXQuestions(this.rounds.length));
    }
}