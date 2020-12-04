public class ClassicRound extends Round {

    public ClassicRound(Question[] q, View ui, double currentscore) {
        super(q, ui, currentscore);
        runRound();
    }

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
