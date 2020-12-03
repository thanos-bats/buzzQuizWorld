import java.util.Scanner;

public class BetRound extends Round {

    private int betscore = 1000;
    private int bet;
    
    public BetRound(Question[] q, View ui) {
        super(q, ui);
        checkIfIsRight();
    }

    public void checkIfIsRight() {
        for (Question q : roundQuestions) {
            cli.showQuestion(q);
            System.out.println("How many point do you want to bet? 250 , 500 , 750 , 1000");
            
            Scanner sc = new Scanner(System.in);
            do {
                bet = sc.nextInt();
            } while (bet != 250 && bet != 500 && bet != 750 && bet != 1000);
            
            betscore -= bet;    // I will create a function which updates score;
            
            if (q.checkRightAnswer(q.answers[cli.readAnswer() + 1])) {
                System.out.println("Correct, You earned your bet points"); 
                betscore += bet;
            }
            System.out.println("You answer is wrong!!!"); 
        }      
    }

    
    
}
    

