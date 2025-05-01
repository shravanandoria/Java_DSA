package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,3,5,3,1,5,0};

//        System.out.println(searchIndexLast(arr, 0, arr.length - 1));
//        findAllIndex(arr, 5, 0);
//        System.out.println(ans);
        System.out.println(findAllIndex3(arr, 5, 0));
    }

    static boolean search2(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || search2(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }

        return arr[index] == target ? index : searchIndex(arr, target, index + 1);
    }

    static int searchIndexLast(int[] arr, int target, int index) {
        if(index == -1) {
            return -1;
        }

        return arr[index] == target ? index : searchIndexLast(arr, target, index - 1);
    }

    static ArrayList<Integer> ans = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return;
        }

        if(arr[index] == target) {
            ans.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }

    static ArrayList findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        return findAllIndex2(arr, target, index + 1, list);
    }

    static ArrayList findAllIndex3(int[] arr, int target, int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length) {
            return ans;
        }

        if(arr[index] == target) {
            ans.add(index);
        }

        ArrayList<Integer> ansBelow = findAllIndex3(arr, target, index + 1);
        ans.addAll(ansBelow);

        return ans;
    }

}
