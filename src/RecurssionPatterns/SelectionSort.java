package RecurssionPatterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,3,5,1,2};
        int[] arr2 = {4,3,2,1};
//        selectionSort(arr2, arr2.length - 1, 0);
        selectionSort2(arr2, arr2.length, 0, 0);
        System.out.println(Arrays.toString(arr2));

    }

    static void selectionSort(int[] arr, int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            if(arr[row] < arr[col]) {
                swap(arr, col, row);
            }
            selectionSort(arr, row, col + 1);
        } else {
            selectionSort(arr, row - 1, 0);
        }
   }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int max(int[] arr, int end) {
        int max = 0;

        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static void selectionSort2(int[] arr, int row, int col, int max) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            if(arr[col] > arr[max]) {
                selectionSort2(arr, row, col + 1, col);
            } else {
                selectionSort2(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selectionSort2(arr, row - 1, 0, 0);
        }
    }
}
