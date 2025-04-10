package SelectionSort;

import java.util.Arrays;

public class SortAlgo {
    public static void main(String[] args) {
        int[] arr = {8,6,4,2,-1,-7,-8,5};
        int[] arr2 = {3,1,5,4,2};
        selection_sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last  = arr.length - i - 1;
            int max = get_max(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int get_max(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }
}
