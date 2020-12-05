/**
 *Class Game is the class which performs Buzz Game
 *@param numOfRounds
 *@param numOfQuestions
 *@param ui the interface
 *@param pool of Questions
 *@param players 
 *@param rounds
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Game {
    private final int numOfRounds = 1;
    private final int numOfQuestions = 2;

    private View ui;
    private QuestionPool pool;
    private Player[] players;
    private Round[] rounds;

/*  The constructor */
    public Game(View ui) throws IOException, InterruptedException {
        this.ui = ui;
        ui.welcome();

        pool = new QuestionPool();
        players = new Player[1];
        this.addPlayers(1);
        rounds = new Round[numOfRounds];

        play();
    }

/*  Play method is the implementation of the game */    
    public void play() throws InterruptedException {
        int gameRound = 0;

        Map<Integer, String> roundType = new HashMap<>();
        roundType.put (0, "ClassicRound");
        roundType.put (1, "BetRound");
        do {
            for(Player player : players) {
                Random rn = new Random();
                int randint = Math.abs (rn.nextInt()) % (roundType.size());

                if (roundType.get (randint) == "ClassicRound") {
                    rounds[gameRound] = new ClassicRound (pool.getXQuestions (numOfQuestions), ui, player.getScore());
                } else {
                    if (roundType.get (randint) == "BetRound") {
                        rounds[gameRound] = new BetRound (pool.getXQuestions (numOfQuestions), ui, player.getScore());
                    }
                }
                player.updateScore(rounds[gameRound].currentscore);
            }
            ui.showScore(players);

            gameRound++;
        } while (gameRound < numOfRounds);
    }
/*  Function addPlayer inits the players of the Game */
    public void addPlayers(int num) {
        for (int i = 0; i < num; i++) {
            this.players[i] = new Player(i);
        }
    }
}
