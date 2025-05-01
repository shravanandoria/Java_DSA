package Recurssion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,9,2,4,5,6};
        int[] arr2 = {7,9,10,12,14,2,4,5,6};
        int target = 4;

        System.out.println(search(arr2, target, 0, arr2.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {

        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[start] <= arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        }

        return search(arr, target, start, mid - 1);
    }
}
