package BitManipulation;

public class SetBits {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(setBits(n));
    }

    static int setBits(int n) {
        int count = 0;

        while(n > 0) {
            count++;

            n -= (n & -n);
        }
        return count;
    }
}
