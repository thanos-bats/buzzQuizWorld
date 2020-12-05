/**
*This class implements the classic type of Round, when the correct Player's answer recieve 1000 points
*@params inherits the Round class variables
*/
public class ClassicRound extends Round {

/*  The constructor */
    public ClassicRound(Question[] q, View ui, double currentscore) throws InterruptedException {
        super(q, ui, currentscore);
        ui.classicDetails();
        runRound();
    }

/*  Main executable function for the Round */
    public void runRound() throws InterruptedException {
        for (Question q : roundQuestions) {
            ui.showQuestion(q);

            int an = ui.readAnswer(new Integer[]{1,2,3,4});
            if (q.checkRightAnswer(q.getAnswers()[an - 1])) {
                ui.correctAnswerMessage (1000);
                currentscore +=1000.0;
            }
            else ui.worgAnswerMessage (0);
            ui.sleep(3);
        }
    }
}
