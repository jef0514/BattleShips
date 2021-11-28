package tool;

import java.util.Scanner;

public class Game {

    Board board = new Board();
    Board board2 = new Board();
    SquareShip ship1 = new SquareShip(board);
    VertShip ship2 =  new VertShip(board);
    HoriShip ship3 = new HoriShip(board);
    Scanner s1 =  new Scanner(System.in);
    Scanner s2 =  new Scanner(System.in);
    Board board3 = new Board();
    Board board4 = new Board();
    SquareShip ship4 = new SquareShip(board3);
    VertShip ship5 =  new VertShip(board3);
    HoriShip ship6 = new HoriShip(board3);
    Scanner s3 =  new Scanner(System.in);
    Scanner s4 =  new Scanner(System.in);
    boolean winner = false;
    int turn = 0;

    public Game() {
        ship1.create(board);
        ship2.create(board);
        ship3.create(board);
        ship4.create(board3);
        ship5.create(board3);
        ship6.create(board3);
    }

    public void play2P() {
        while (winner == false) {
            if (turn %2 ==0) {
                //System.out.println(board);
                if (ship1.sunk(board)==false || ship2.sunk(board)==false || ship3.sunk(board)==false) {
                    System.out.println("P1: Enter the Vertical Co-ordinate");
                    int pos1 = s1.nextInt();
                    System.out.println("P1: Enter the Horizontal Co-ordinate");
                    int pos2 = s2.nextInt();
                    if (board.attack(pos1, pos2) == true) {
                        board2.set(pos1, pos2, 'H');
                        System.out.println(board2.toString());
                    }
                    else {
                        board2.set(pos1, pos2, 'M');
                        System.out.println(board2.toString());
                    }

                    if (ship1.sunk(board)==true) {
                        System.out.println("You Have Sunk the Square Ship");
                    }

                    if (ship2.sunk(board)==true) {
                        System.out.println("You Have Sunk the Vertical Ship");
                    }

                    if (ship3.sunk(board)==true) {
                        System.out.println("You Have Sunk the Horizontal Ship");
                    }
                }
                if (ship1.sunk(board)==true && ship2.sunk(board)==true && ship3.sunk(board)==true) {
                    System.out.println("Player 1 wins!");
                    winner = true;
                    break;
                }
                turn += 1;
                //System.out.println(turn);
                


        }
            if (turn %2 != 0) {
                if (ship4.sunk(board3)==false || ship5.sunk(board3)==false || ship6.sunk(board3)==false && turn %2 != 0) {
                    System.out.println("P2: Enter the Vertical Co-ordinate");
                    int pos1 = s3.nextInt();
                    System.out.println("P2: Enter the Horizontal Co-ordinate");
                    int pos2 = s4.nextInt();
                    if (board3.attack(pos1, pos2) == true) {
                        board4.set(pos1, pos2, 'H');
                        System.out.println(board4.toString());
                    }
                    else {
                        board4.set(pos1, pos2, 'M');
                        System.out.println(board4.toString());
                    }

                    if (ship4.sunk(board3)==true) {
                        System.out.println("You Have Sunk the Square Ship");
                    }

                    if (ship5.sunk(board3)==true) {
                        System.out.println("You Have Sunk the Vertical Ship");
                    }

                    if (ship6.sunk(board3)==true) {
                        System.out.println("You Have Sunk the Horizontal Ship");
                    }

                }
                if (ship4.sunk(board3)==true && ship5.sunk(board3)==true && ship6.sunk(board3)==true) {
                    System.out.println("Player 2 wins!");
                    winner = true;
                    break;
            }
            turn += 1;
            //System.out.println(turn);
        }
        }
}   
}
