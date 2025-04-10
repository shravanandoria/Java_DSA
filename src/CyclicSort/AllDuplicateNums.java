package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDuplicateNums {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println((find_all_duplicates(arr)));
    }


    static ArrayList<Integer> find_all_duplicates (int[] arr) {
        int index = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(index < arr.length) {

            if(arr[index] != index + 1){
                int correctIndex = arr[index] - 1;

                if(arr[index] != arr[correctIndex]) {
                    swap(arr, index, correctIndex);
                } else {
                    ans.add(arr[index]);
                    index++;
                }
            } else {
                index++;
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
