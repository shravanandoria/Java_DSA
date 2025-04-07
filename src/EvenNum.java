public class EvenNum {
    public static void main(String[] args) {

        int[] arr = {20, 18, 4, 1, 0, -10, -12, -16};
        int target = -12;

        System.out.println(OrderAgnosticBS(arr, target));

    }

    static int OrderAgnosticBS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[0] < arr[arr.length - 1];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(isAscending) {
                if(target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }
}