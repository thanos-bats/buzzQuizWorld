import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser; 
import java.io.FileReader;
import java.util.Iterator;

public class Game {     
    private Player [] players;

    public Game() { 
    }

    public void setGamesPlayers(int num) {
        for (int i = 0; i < num; i++) {
            Player a = new Player(i);
        }
    }



    public void JsonParserr() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("Questions.json"));

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray questionsList = (JSONArray) jsonObject.get("QuestionPool");

            Iterator it = questionsList.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
                
            }
    
        }   catch (Exception e) {
            e.printStackTrace();
        }
    } 
    public static void main(String []args) {
        Game g = new Game();
        g.JsonParserr();
        
    }
}