import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface View {

    //public int getNumOfPlayers();
    public int readAnswer();
    public void showQuestion(Question q);

}
