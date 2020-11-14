import java.util.Scanner;  
import java.util.ArrayList;


public class Game {
    private ArrayList<String> questions;
    private Player[] players;

    public Game(int num) {
        questions = new ArrayList<String>();
        setGamesPlayers(num);
    }

    public void setGamesPlayers(int num) {
        for (int i = 0; i < num; i++) {
            this.players[i] = new Player(i + 1);
        }
    }
}