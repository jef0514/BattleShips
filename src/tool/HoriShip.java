package tool;

import java.util.Random;

public class HoriShip implements IShip {
    Random rnd = new Random();
    private int num1 = rnd.nextInt(4);
    private int num2 = rnd.nextInt(2);

    public HoriShip(Board board) {

    }

    public void create(Board board) {
        while (board.check(num1, num2, 'b') == true || board.check(num1, num2+1, 'b') == true || board.check(num1, num2+2, 'b') == true ) {
            num1 = rnd.nextInt(4);
            num2 = rnd.nextInt(3);
        }
        board.set(num1, num2, 'b');
        board.set(num1, num2+1, 'b');
        board.set(num1, num2+2, 'b');
    }

    public Boolean sunk(Board board) {
        if ((board.check(num1, num2, 'H') == true && board.check(num1, num2+1, 'H') == true && board.check(num1, num2+2, 'H') == true)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
