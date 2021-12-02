package tool;

import java.util.Arrays;

public class Board {
    
    private char[][] board;

    public Board() {
        board = new char[][] {{'w','w','w','w','w'},{'w','w','w','w','w'},{'w','w','w','w','w'},{'w','w','w','w','w'},{'w','w','w','w','w'}};
    }

    public String toString() {
        String output = "\n";
        for (int i=board.length-1; i>-1; i--) {
            output += Arrays.toString(board[i])+"\n";
        }
        return output;
    }

    public void set(int pos1, int pos2, char newC) {
        board[pos1][pos2] = newC;
    }

    public boolean check(int pos1, int pos2, char c) {
        if (board[pos1][pos2] == c) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean attack(int pos1, int pos2) {
        if (board[pos1][pos2] == 'b') {
            board[pos1][pos2] = 'H';
            System.out.println("You hit a ship");
            return true;
        }
        else if (board[pos1][pos2] == 'M') {
            System.out.println("You already attacked here");
            return false;
        }
        else if (board[pos1][pos2] == 'H') {
            System.out.println("You already attacked here");
            return false;
        }
        else {
            board[pos1][pos2] = 'M';
            System.out.println("You missed");
            return false;
        }
    }

}