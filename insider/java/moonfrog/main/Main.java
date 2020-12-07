package moonfrog.main;

import moonfrog.main.inmemory.TicTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String arg[]){
        System.out.println( "Starting Tic Tac Toe");
        TicTacToe.display();
        Scanner in = new Scanner(System.in);
        int i=0;
        boolean isGameDraw =false;
        while (!isGameDraw && TicTacToe.whoWon() ==-1) {
            if(TicTacToe.isGameDraw())
            {
                isGameDraw=true;
                break;
            }
            System.out.println("Player-"+i%2+"'s turn. Enter any number from 1-9 to indicate your move.");
            int s = in.nextInt();
            System.out.println("You entered number " + s);

            if( s<1 &&s>9) {
                System.out.println("Invalid Location");
                continue;
            }
            if(TicTacToe.checkIfAlreadyOccupied(s)) {
                System.out.println("location is already occupied please try again ...... !!");
                continue;
            }
            TicTacToe.push(s,(i%2)+1);
            TicTacToe.display();
            i++;
        }
        if(isGameDraw){
            System.out.println("Game Over : Draw");
        }else {
            System.out.println("Game Over :: Player-" + (i - 1) % 2 + "' WON!!. ");
        }
    }
}
