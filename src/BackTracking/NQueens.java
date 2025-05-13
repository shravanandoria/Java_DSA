package BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }


    static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int i = 0; i < board.length; i++) {
            board[row][i] = true;
            if(isSafe(board, row, i)) {
                count += queens(board, row + 1);
            }
            board[row][i] = false;
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
//        check upside
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

//        check max left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);

        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean element: row) {
                if(element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
