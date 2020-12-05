/**
*View implements an interface
*/

public interface View {

    //public int getNumOfPlayers();

/*  Calling cli functions display messages   */    
    void welcome();
    void betDetails() throws InterruptedException;
    void classicDetails() throws InterruptedException;

    void correctAnswerMessage(double points) throws InterruptedException;
    void worgAnswerMessage(double points) throws InterruptedException;
    void showBetValues(int[] values);
    void showScore(Player[] players);
    int readAnswer(Integer[] values);
    void showQuestion(Question q) throws InterruptedException;
    void sleep(int i) throws InterruptedException;
}
