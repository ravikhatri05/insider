package moonfrog.main.inmemory;

public class TicTacToe {

    public static int[][] ticTacToe = new int[3][3];

    public static boolean isGameDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (ticTacToe[i][j] != 1 && ticTacToe[i][j] != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int whoWon() {
        int i = 0;
        if (((ticTacToe[i][i + 1] !=0 && ticTacToe[i][i + 1] == ticTacToe[i][0] && ticTacToe[i][i + 2] !=0 && ticTacToe[i][i + 2] == ticTacToe[i][0]) ||
                (ticTacToe[i + 1][i + 1] !=0 && ticTacToe[i + 1][i + 1] == ticTacToe[i][0] && ticTacToe[i + 2][i + 2] !=0 && ticTacToe[i + 2][i + 2] == ticTacToe[i][0])
                || (ticTacToe[i + 1][i] !=0 && (ticTacToe[i + 1][i] == ticTacToe[i][0] && ticTacToe[i + 2][i] !=0 && ticTacToe[i + 2][i] == ticTacToe[i][0])))
                && (ticTacToe[i][0] != 0)) {
            return ticTacToe[i][0];
        }
        i = 1;

        if (((ticTacToe[i][i] !=0 && ticTacToe[i][i] == ticTacToe[0][i] &&   ticTacToe[i + 1][i] !=0 &&ticTacToe[i + 1][i] == ticTacToe[0][i])) && (ticTacToe[0][i] != 0)) {
            return ticTacToe[i][i];
        }
        i = 2;
        if (((ticTacToe[1][i] != 0 && ticTacToe[1][i] == ticTacToe[0][i] && ticTacToe[i][i] !=0 && ticTacToe[i][i] == ticTacToe[0][i])
                || ( ticTacToe[i - 1][i - 1] !=0 && ticTacToe[i - 1][i - 1] == ticTacToe[0][i] && ticTacToe[i][i-2] !=0 && ticTacToe[i][i-2] == ticTacToe[0][i]))
                && (ticTacToe[0][i] != 0)) {
            return ticTacToe[1][i];
        }
        i = 1;
        int j=0;
        if(ticTacToe[i][j] !=0 && ( ticTacToe[i][j+1] !=0 && ticTacToe[i][j] == ticTacToe[i][j+1]) && (ticTacToe[i][j+2]) !=0 && ticTacToe[i][j] == ticTacToe[i][j+2])
        {
            return ticTacToe[i][j];
        }
        i = 2;
        j=0;
        if(ticTacToe[i][j] !=0 && ( ticTacToe[i][j+1] !=0 && ticTacToe[i][j] == ticTacToe[i][j+1]) && (ticTacToe[i][j+2]) !=0 && ticTacToe[i][j] == ticTacToe[i][j+2])
        {
            return ticTacToe[i][j];
        }
        return -1;

    }

    public static void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (ticTacToe[i][j] == 1) {
                    System.out.print("X");
                } else if (ticTacToe[i][j] == 2) {
                    System.out.print("0");
                } else {
                    System.out.print("_");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static boolean checkIfAlreadyOccupied( int loc){
        int j = (loc-1) % 3;
        int i= (loc-1) /3 ;

        if(ticTacToe[i][j] !=0 ){
            return true;
        }
        return false;

    }
    public static void push(int loc, int playerId) {
        int j = (loc-1) % 3 ;
        int i= (loc-1) /3 ;

        ticTacToe[i][j] = playerId;
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (++count == loc) {
                    ticTacToe[i][j] = playerId;
                }
            }
        }*/

    }


}
