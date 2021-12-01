package tool;

import java.util.Scanner;
import java.util.Random;

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
    Random rnd = new Random();

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
    public void play1P() {
        int pos3 = 0;
        int pos4 = 0;
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
                //System.out.println("It is turn "+turn);
                


        }
            if (turn %2 !=0) {
                if (ship4.sunk(board3)==false || ship5.sunk(board3)==false || ship6.sunk(board3)==false && turn %2 != 0) {
                    boolean valid = false;
                    int hit = 0;
                    int pos1, pos2 = 0;
                    while (valid == false) {
                        switch(hit){
                            case 1:
                                if (pos3 == 4) {
                                    hit += 1;
                                }
                                else {
                                    pos1 = pos3 + 1;
                                    pos2 = pos4;
                                    hit += 1;
                                }
                            case 2:
                                if (pos3 == 0) {
                                    hit += 1;
                                }
                                else {
                                    pos1 = pos3 - 1;
                                    pos2 = pos4;
                                    hit += 1;
                                }
                            case 3:
                                if (pos4 == 4) {
                                    hit += 1;
                                }
                                else {
                                    pos1 = pos3;
                                    pos2 = pos4+1;
                                    hit += 1;
                                }
                            case 4:
                                if (pos4 == 0) {
                                    hit += 1;
                                }
                                else {
                                    pos1 = pos3;
                                    pos2 = pos4-1;
                                    hit = 0;
                                }
                            default:
                                pos1 = rnd.nextInt(4);
                                pos2 = rnd.nextInt(4);
                        }

                        if (board3.check(pos1, pos2, 'w')) {
                            if (board3.attack(pos1, pos2) == true) {
                                board4.set(pos1, pos2, 'H');
                                System.out.println("AI attacked position"+" "+pos1+" "+pos2);
                                System.out.print("It was a hit");
                                System.out.println(board4.toString());
                                pos3 = pos1;
                                pos4 = pos2;
                                hit = 1;
                            }
                            else {
                                board4.set(pos1, pos2, 'M');
                                System.out.println("AI attacked position"+" "+pos1+" "+pos2);
                                System.out.print("It was a miss");
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
                            valid = true;
        
                        }
                        if (ship4.sunk(board3)==true && ship5.sunk(board3)==true && ship6.sunk(board3)==true) {
                            System.out.println("Player 2 wins!");
                            winner = true;
                            break;
                    }
                    }
                    }
                turn += 1;
                //System.out.println("It is turn "+turn);
            }
        }
    }
}


