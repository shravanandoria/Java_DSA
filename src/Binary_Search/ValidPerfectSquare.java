package Binary_Search;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(search(num));
    }

    static boolean search(int num){
        int start = 0;
        int end = num;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if((long)mid * mid == num) {
                return true;
            }

            if((long)mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
