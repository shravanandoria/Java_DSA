package Recurssion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1224001;
        System.out.println(count(n, 0));
    }

    static int count(int n, int sum) {
        if(n == 0) {
            return sum;
        }

        int rem = n % 10;
        if(rem == 0) {
            return count(n / 10, sum + 1);
        }

        return count(n / 10, sum);
    }
}
