package TicTacToe;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        while(!gameOver) {
            printBoarad(board);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = gameOver(board, player);
                if(gameOver){
                    System.out.println(player + " has won the game!!");
                    printBoarad(board);
                }
                player = player == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Invalid input, Try Again!!");
            }
        }
    }

    public static boolean gameOver(char[][] board, char player) {
//        [1,2,3]
//        [1,2,3]
//        [1,2,3]

        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
            if(board[0][row] == player && board[1][row] == player && board[2][row] == player) {
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }


        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    public static void printBoarad(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
