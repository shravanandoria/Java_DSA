package BitManipulation;

public class CountSetBit {
    public static void main(String[] args) {
        int n = 9;
        int ans = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                ans++;
            }
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
