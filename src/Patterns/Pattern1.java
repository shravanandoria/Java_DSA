package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern8(4);
    }

    static void pattern8(int n) {
        int originalN = n;
        n = n * 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - col, n - row));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int c = row > n ? n * 2 - row : row;

            for (int col = 0; col < n - c; col++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int spaces = row <= n ? n - row : n - (n * 2 - row);
            int colsPerRow = n - spaces;

            for (int col = 1; col <= spaces; col++) {
                System.out.print("  ");
            }
            for (int i = spaces + 1; i <= colsPerRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n * 2 ; row++) {
            int totalRow = n * 2;
            int cols = row <= totalRow / 2 ? row : totalRow - row;

            for (int col = 1; col <= cols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
