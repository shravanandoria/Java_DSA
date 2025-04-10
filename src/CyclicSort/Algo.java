package CyclicSort;

import java.util.Arrays;

public class Algo {
    public static void main(String[] args) {
        int[] arr = {3,0,2,5,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int index = 0;

        while(index < arr.length) {
            int correctIndex = arr[index] - 1;

            if(arr[index] != arr[correctIndex]) {
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
