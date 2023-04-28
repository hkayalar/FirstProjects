
import java.util.Scanner;

public class TicTacToe {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] board = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };
        System.out.println("Let's play TicTacToe!\n");
        printBoard(board);

        for (int i=0; i<9; i++){
            int count = checkWin(board);
            if (count==0) {
                if (i % 2 == 0) {
                    System.out.println(" Turn: X");
                    System.out.print("Pick a row and column number: ");
                    int[] spot = askUserX(board);

                    printBoard(board);

                } else {
                    System.out.println(" Turn: O");
                    System.out.print("Pick a row and column number: ");
                    int[] spot = askUserO(board);
                    printBoard(board);
                }
            }
            else if (count==1){
                System.out.println("X WON! CONGRATS!!!"); break;
            }
            else if(count==2){
                System.out.println("O WON! CONGRATS!!!"); break;
            }

        }

    }
    public static void printBoard(char[][] board){

        for(int i=0; i<board.length; i++){

            System.out.print("    ");

            for (int j=0; j<board[i].length; j++){

                System.out.print(" " + board[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static int[] askUserX(char[][] board){
        int [] spot = new int[2];
        spot[0] = scan.nextInt();
        spot[1] = scan.nextInt();
        if (board[spot[0]][spot[1]] != '_') {
            System.out.println("This spot is not empty. Please Try Again.");
            askUserX(board);
        }
        else {
            board[spot[0]][spot[1]] = 'X';
        }

        return spot;
    }
    public static int[] askUserO(char[][] board){
        int [] spot = new int[2];
        spot[0] = scan.nextInt();
        spot[1] = scan.nextInt();
        if (board[spot[0]][spot[1]] != '_') {
            System.out.println("This spot is not empty. Please Try Again.");
            askUserO(board);
        }
        else {
            board[spot[0]][spot[1]] = 'O';
        }

        return spot;
    }
    public static int checkWin(char[][] board){
        int count = 0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
               if ((board[i][0]=='X' && board[i][1]=='X' && board[i][2]=='X') || (board[0][j]=='X' && board[1][j]=='X' && board[2][j]=='X') || (board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X') || (board[2][0]=='X' && board[1][1]=='X' && board[0][2]=='X')){
                    count = 1;
               }
                else if  ((board[i][0]=='O' && board[i][1]=='O' && board[i][2]=='O') || (board[0][j]=='O' && board[1][j]=='O' && board[2][j]=='O') || (board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O') || (board[2][0]=='O' && board[1][1]=='O' && board[0][2]=='O')){
                    count = 2;
                }
            }
        }
        return count;
    }
}
