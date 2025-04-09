package Binary_Search;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 4, 2};
//        4, 5, 6, 7, 7, 0, 1, 2, 3
        int target = 3;
        System.out.println(find_ans(arr, target));
    }

    static int find_ans(int[] arr, int target) {
        int pivot = pivot_duplicates(arr);

        if(pivot == -1) {
            return search(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }

        if(target >= arr[0]) {
            return search(arr, target, 0, pivot - 1);
        }

        return search(arr, target, pivot + 1, arr.length - 1);
    }

    static int pivot_duplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
