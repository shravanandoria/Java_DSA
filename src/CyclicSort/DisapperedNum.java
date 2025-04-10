package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class DisapperedNum {

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        List<Integer> nums = find(arr);
    }


    static ArrayList<Integer> find(int[] arr) {
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

    static ArrayList<Integer> search(int[] arr) {
        // [1,2,3,4,5,6]
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(i != arr[i] - 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
