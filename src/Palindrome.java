public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            int start = i;
            int end = str.length() - 1 - i;

            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
        }

        return true;
    }
}
