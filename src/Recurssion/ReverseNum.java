package Recurssion;

public class ReverseNum {
    public static void main(String[] args) {
//        rev1(1342);
//        System.out.println(sum);

//        System.out.println(rev2(1342, 0));
        System.out.println(rev3(1342));
    }

    static int sum = 0;
    static void rev1(int n) {
        if( n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    static int rev2(int n, int sum) {
        if(n == 0) {
            return sum;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;

        return rev2(n / 10, sum);
    }

    static int rev3(int n) {
        int digits = (int)(Math.log10(n)) + 1;

        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }

        return (n % 10 * (int)Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
