package tool;

import java.util.Random;

public class VertShip implements IShip{
    Random rnd = new Random();
    private int num1 = rnd.nextInt(2);
    private int num2 = rnd.nextInt(4);

    public VertShip(Board board) {

    }

    public void create(Board board) {
        while (board.check(num1, num2, 'b') == true || board.check(num1+1, num2, 'b') == true || board.check(num1+2, num2, 'b') == true ) {
            num1 = rnd.nextInt(2);
            num2 = rnd.nextInt(4);
        }
        board.set(num1, num2, 'b');
        board.set(num1+1, num2, 'b');
        board.set(num1+2, num2, 'b');
    }

    public Boolean sunk(Board board) {
        if ((board.check(num1, num2, 'H') == true && board.check(num1+1, num2, 'H') == true && board.check(num1+2, num2, 'H') == true)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
