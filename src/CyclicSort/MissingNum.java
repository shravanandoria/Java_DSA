package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(find_missing_num(arr));

    }


    static int find_missing_num(int[] arr) {
        int index = 0;

        while(index < arr.length) {
            int correctIndex = arr[index];
            if(arr[index] < arr.length && arr[index] != arr[correctIndex]) {
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }

        return search(arr);
    }

    static int search(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(i != arr[i]) {
                return i;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
