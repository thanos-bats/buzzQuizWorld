public class ClassicRound extends Round {

    public ClassicRound(Question[] q, View ui, double currentscore) throws InterruptedException {
        super(q, ui, currentscore);
        ui.classicDetails();
        runRound();
    }

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
