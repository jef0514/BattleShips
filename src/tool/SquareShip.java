package tool;

import java.util.Random;

public class SquareShip implements IShip {
    Random rnd = new Random();
    private int num1 = rnd.nextInt(3);
    private int num2 = rnd.nextInt(3);

    public SquareShip(Board board) {

    }

    public void create(Board board) {
        while (board.check(num1, num2, 'b') == true || board.check(num1+1, num2, 'b') == true || board.check(num1, num2 +1, 'b') == true || board.check(num1+1, num2+1, 'b') == true ) {
            num1 = rnd.nextInt(3);
            num2 = rnd.nextInt(3);
        }
        board.set(num1, num2, 'b');
        board.set(num1+1, num2, 'b');
        board.set(num1, num2+1, 'b');
        board.set(num1+1, num2+1, 'b');
    }

    public Boolean sunk(Board board) {
        if ((board.check(num1, num2, 'H') == true && board.check(num1+1, num2, 'H') == true && board.check(num1, num2 +1, 'H') == true && board.check(num1+1, num2+1, 'H') == true )) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
