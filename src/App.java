import tool.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        Scanner s1 = new Scanner(System.in);
        System.out.println("1 or 2 Players:");
        int ans = s1.nextInt();
        if  (ans == 1){
            game.play1P();
        }
        else if (ans == 2) {
            game.play2P();
        }
        s1.close();
    }
}
