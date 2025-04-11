package CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {3,2,2};
        System.out.println(Arrays.toString(find_mismatch(arr)));
        System.out.println(Arrays.toString(arr));
    }


    static int[] find_mismatch(int[] arr) {
        int index = 0;
        while(index < arr.length) {
            int correctIndex = arr[index] - 1;
            if(arr[index] != arr[correctIndex]) {
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }

        return search(arr);
    }

    static int[] search(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                return new int[] {arr[i], i + 1};
            }
        }

        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
