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

    
    

    

    
    
    
}
