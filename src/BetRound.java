/**
* This Class implements the Bet type of Rounds 
*/

import java.util.Scanner;

public class BetRound extends Round {

    /*The BetRound Constructor */
    public BetRound(Question[] q, View ui, double currentscore) {
        super(q, ui, currentscore);
        runRound();
    }

/*
*   Fuction runRound displays the round Questions and recieve the Player's answer
*   Checks if the answer is correct and updates the score
*   @return the Player's score
*/
    public double runRound() {
        for (Question q : roundQuestions) {
            int bet;

            ui.showQuestion(q);
            ui.showMessage("How many points do you want to bet? 250 , 500 , 750 , 1000");

            Scanner sc = new Scanner(System.in);
            do {
                bet = sc.nextInt();
            } while (bet != 250 && bet != 500 && bet != 750 && bet != 1000);

            int an = ui.readAnswer();
            if (q.checkRightAnswer(q.getAnswers()[an - 1])) {
                ui.showMessage("Correct, You earned your bet points");
                currentscore += bet;
            }
            else {
                ui.showMessage("You answer is wrong!!!");
                currentscore -= bet;
            }
        }

        return currentscore;
    }
}
