package Binary_Search;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {-3,3,4,90};
        System.out.println(Arrays.toString(twoSum(arr, 0)));
    }

    static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;


            if(numbers[start] + numbers[end] == target) {
                return new int[] {start + 1, end + 1};
            }

            if(numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[] {-1, -1};
    }
}
