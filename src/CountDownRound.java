import java.util.Timer;
import java.util.TimerTask;


public class CountDownRound  extends Round { 

    private int secondsPassed = 60;
    Cli cli = new Cli();


    public CountDownRound(Question[] q, View ui) {
        super(q, ui);
    }
 
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            secondsPassed --;
            System.out.println("Seconds passed:" + secondsPassed);
            
            
            if (secondsPassed <= 0) {
                timer.cancel();
            }
                
        }
    };
    

    public void start() {
        timer.schedule(task, 1000, 1000);
        
    }

    public void checkIfIsRight() {
        for (Question q : roundQuestions) {
            cli.showQuestion(q);
            start();
            cli.readAnswer();
            if (answerValidation(cli.readAnswer())) {
                timer.cancel();
            }
            
            System.out.println(secondsPassed);

            
        }
    }
    

    public boolean answerValidation(int answer) {
        if (answer != 1 ||  answer != 2 || answer != 3 || answer != 4) {
            return false; 
        }
        return true;
    }

    public static void main(String[] args ) {
        Question[] q = new Question[4];
        CountDownRound n = new CountDownRound(q, ui);
        n.start();        



    }

    
    
}
