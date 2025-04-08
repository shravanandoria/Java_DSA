package Binary_Search;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(find_ans(arr, target));
    }

    static int find_ans(int[] arr, int target) {
        int pivot = find_pivot(arr);
        System.out.println("Pivot: " + pivot);

        if(pivot == -1) {
            return search(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }

        if(arr[0] <= target) {
            return search(arr, target, 0, pivot - 1);
        }

        return search(arr, target, pivot + 1, arr.length - 1);
    }

    static int find_pivot_with_duplicates(int[] arr) {
//        [2,9,2,2,2,2]
//        [9,9,2,3,9]
//        [6,7,9,5]
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                return mid + 1;
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
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

         return -1;
    }

    static int find_pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
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
