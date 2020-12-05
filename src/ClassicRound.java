/**
* This class implements the first type of Round, when the correct Player's answer recieve 1000 points
*/
public class ClassicRound extends Round {

/*  Constructo of the class */
    public ClassicRound(Question[] q, View ui, double currentscore) {
        super(q, ui, currentscore);
        runRound();
    }

/*  Fuction runRound displays the round Questions and recieve the Player's answer
*   Checks if the answer is correct and updates the score
*   @return the Player's score
*/
    public double runRound() {
        for (Question q : roundQuestions) {
            ui.showQuestion(q);

            int an = ui.readAnswer();
            if (q.checkRightAnswer(q.getAnswers()[an - 1])) {
                ui.showMessage("Correct, You earned 1000 points");
                currentscore +=1000.0;
            }
            else ui.showMessage("Your answer is wrong!!!");
        }
        return currentscore;
    }
}
