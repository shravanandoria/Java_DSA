package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(solve(board)) {
            display(board);
        }else {
            System.out.println("Cannot solve this sudoku");
        }

    }

    static boolean solve(int[][] board) {

        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft) {
                break;
            }
        }

        if(emptyLeft) {
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if(isSafe(board, row, col, i)) {
                board[row][col] = i;

                if(solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num) {
                return false;
            }
        }

        for(int[] nums: board) {
            if(nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int rStart = row - row % sqrt;
        int cStart = col - col % sqrt;

        for (int i = rStart; i < rStart + sqrt; i++) {
            for (int j = cStart; j < cStart + sqrt ; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void display(int[][] board) {
        for(int[] row: board) {
            for(int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
