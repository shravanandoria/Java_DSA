package RecurssionPatterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,3,6,1,5};
        int[] arr2 = {8,5,7,2,1};
        bubble_sort(arr2, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr2));
    }

    static void bubble_sort(int[] arr, int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            if(arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble_sort(arr, row, col + 1);
        } else {
            bubble_sort(arr, row - 1, 0);
        }
    }

}
