/**
 * This Class imprements a Command Line interface 
 * Cli contains functions for the user interface
 */

import java.util.Scanner;

public class Cli implements View {
/*  The constructor of the class */
    public Cli() {
        System.out.println("Hello, let's play Buzz!");
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

/*  Class read answer recieve the answer from the user */
    @Override
    public int readAnswer() {
        Scanner sc = new Scanner(System.in);
        int an;
        do {
            System.out.println("Write your answer here -> ");
            an = sc.nextInt();
            if (an < 1 || an > 4) {
                System.out.println("Please write 1,2,3 or 4");
            }
        } while (an != 1 && an != 2 && an != 3 && an != 4);

        return an;
    }

/*  Function showQuestion prints the questions to user */
    @Override
    public void showQuestion(Question q) {
        System.out.println(q.getCategory());
        System.out.println(q.getQuestion());
        int i = 1;
        for (String an : q.getAnswers()) {
            System.out.println(i + " " + an);
            i++;
        }
    }


/*  showMessage method displays messages to command line interface*/
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
