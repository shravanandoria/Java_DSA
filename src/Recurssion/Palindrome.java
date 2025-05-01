package Recurssion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome2(1234321));
    }
    static boolean isPalindrome(int n) {
        return n == rev(n);
    }
    static int rev(int n) {
        if(n % 10 == n) {
             return n;
        }
        int digits = (int)Math.log10(n) + 1;

        return n % 10 * (int)Math.pow(10, digits - 1) + rev(n / 10);
    }

    static boolean isPalindrome2(int n) {
//        1234321
        int digits = (int)Math.log10(n);
        return helper(n, digits);
    }

    static boolean helper(int n, int digits) {

        if(digits < digits / 2) {
            return true;
        }
        if(n % 10 != n / digits) {
            return false;
        }
        return helper(n, digits - 1);
    }

    
    
}
