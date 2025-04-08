package Binary_Search;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        System.out.println(find_ans(arr, target));
    }

    static int find_ans(int[] arr, int target) {
        int peak_index = find_peak(arr);

        int first_half = search(arr, target, 0, peak_index);

        if(first_half == -1) {
            return search(arr, target, peak_index + 1, arr.length - 1);
        }

        return first_half;
    }

    static int find_peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int search(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAscending) {
                if(target > arr[mid]) {
                    start = mid + 1;
                } else if(target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else if(target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


}


