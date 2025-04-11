package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern4(5);
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
