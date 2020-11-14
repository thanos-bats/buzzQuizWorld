import java.util.Scanner;  
import java.util.ArrayList;


public class Game {
    
    int players;
    ArrayList<String> questions;

    public Game(int players) {
        this.players = players;
        questions = new ArrayList<String>();
        System.out.print("number of players:" + players);

    }

    public void setGamesPlayers(int players) {
        for (int i=1; i<=players; i++) {
            Player p = new Player(i);
        
        }
    }
 
     
    /*
    public static void main(String [] args) {
        Game g = new Game(1);
        
    } */ 

}