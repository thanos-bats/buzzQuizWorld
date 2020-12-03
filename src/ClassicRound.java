public class ClassicRound extends Round {
    //Mabe useless 

    private long score =  0;
    
    public ClassicRound(Question[] q, View ui) {
        super(q, ui);
        checkIfIsRight();
    }

    public void checkIfIsRight() {
        for (Question q : roundQuestions) {
            ui.showQuestion(q);
            if (q.checkRightAnswer(q.answers[ui.readAnswer() + 1])) {
                System.out.println("Correct, You earned 1000 points"); //Mabe it will be to the interface
                score +=1000.0;
            }
            System.out.println("You answer is wrong!!!"); //Mabe it will be to the interface
        }      
    }
}