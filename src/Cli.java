import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Cli implements View {
    public Cli() {
        //getNumOfPlayers();
    }

    /*public int getNumOfPlayers() {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("Solo or Multiplayer?");
            num = scan.nextInt();
        } while(num != 1 && num != 2);
        scan.close();

        return num;
    } */

    @Override
    public void welcome(){
        System.out.println("Welcome");
        System.out.println("Hello, let's play Buzz!\n\n");
    }

    @Override
    public void betDetails() throws InterruptedException {
        System.out.println("Let's bet some points now.");
        System.out.println("You can bet 250, 500, 750 or 1000 points and if you answer correclty, you get back the doubles");
        this.sleep(1);
        System.out.println("GOOD LUCK\n");
        this.sleep (3);
    }

    @Override
    public void classicDetails() throws InterruptedException {
        System.out.println("Let's play Classic Round.");
        System.out.println ("For every correct answer you earn 1000 points.");
        this.sleep(1);
        System.out.println("GOOD LUCK\n");
        this.sleep(3);
    }

    @Override
    public void worgAnswerMessage(double points) throws InterruptedException {
        System.out.println("Your answer is worg");
        if (points != 0) {
            System.out.println("You lost " + points + " points\n");
        }
        this.sleep(2);
    }

    @Override
    public void correctAnswerMessage(double points) throws InterruptedException {
        System.out.println("Correct. You earned " + points + " points\n");
        this.sleep(2);
    }

    @Override
    public void showBetValues(int[] values) {
        StringBuilder str = new StringBuilder ("How many points do you want to bet?");
        for (int v : values) {
            str.append(" ").append(v).append(",");
        }
        str = new StringBuilder (str.substring (0, str.length () - 1));
        System.out.println(str);
    }

    @Override
    public void showScore(Player[] players) {
        for (Player p : players) {
            System.out.println("The " + (p.getId () + 1) + "st player has " + p.getScore () + " points\n");
        }
    }

    @Override
    public int readAnswer(Integer[] values) {
        Set<Integer> set = new HashSet<>(Arrays.asList(values));

        Scanner sc = new Scanner(System.in);
        int an;
        do {
            System.out.println("Write your answer");
            an = sc.nextInt();
            if (!set.contains(an)) {
                System.out.println("Please, give correct value.");
            }
        } while (!set.contains(an));

        return an;
    }

    @Override
    public void showQuestion(Question q) throws InterruptedException {
        System.out.println("The category of answer is: " + q.getCategory());
        this.sleep(2);
        System.out.println(q.getQuestion());
        this.sleep(4);
        int i = 1;
        for (String an : q.suffleAnswers()) {
            System.out.println(i + " " + an);
            this.sleep(1);
            i++;
        }
    }

    @Override
    public void sleep(int i) throws InterruptedException {
        TimeUnit.SECONDS.sleep(i);
    }

}
