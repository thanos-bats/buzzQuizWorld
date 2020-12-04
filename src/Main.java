import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Cli ui = new Cli();
        Game g = new Game(ui);
    }
}
