public class ClassicRound extends Round {
    //Mabe useless 
    Cli cli = new Cli();
    private int score = 0;    
    
    public ClassicRound() {
        super(roundQuestions, ui);
        checkIfIsRight();
        

    }

    public void checkIfIsRight() {
        for (Question q : roundQuestions) {
            cli.showQuestion(q);
            if (q.checkRightAnswer(q.answers[cli.readAnswer() + 1])) {
                System.out.println("Correct, You earned 1000 points"); //Mabe it will be to the interface
                score +=1000;
            }
            System.out.println("You answer is wrong!!!"); //Mabe it will be to the interface
        }      
    }
}