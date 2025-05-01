package Recurssion;

public class StepsCount {
    public static void main(String[] args) {
        int n = 41;
        System.out.println(solve(n, 0));
    }

    static int solve(int n, int steps) {
        if(n == 0) {
            return steps;
        }

        if(n % 2 == 0) {
            return solve(n / 2, ++steps);
        } else {
            return solve(n - 1, ++steps);
        }
    }
}
