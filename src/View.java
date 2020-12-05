/**
 * View implements an interface
 */
public interface View {

    //public int getNumOfPlayers();
    int readAnswer();
    void showQuestion(Question q);
    void showMessage(String message);
}
