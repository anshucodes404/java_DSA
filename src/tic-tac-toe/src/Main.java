import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        char[][] board = new char[3][3];

        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.print("Player " + player + " enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                // place the element

                board[row][col] = player;
                gameOver = hasWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try Again!!!");
            }
        }
        printBoard(board);
        sc.close();
    }

    static boolean hasWon(char[][] board, char player) {

        //for all rows
        for(int row = 0; row < board.length; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) return true;
        }

        for(int col = 0; col < board.length; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) return true;
        }

        //checking for diagonals

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }

    static void printBoard(char[][] board) {
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + "  ");
            }
            System.out.println();
        }
    }

}