package Binary_Search;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;

        System.out.println(search(arr, m));
    }

    static int search(int[] arr, int allowed_pieces) {
        int start = get_max(arr);
        int end = get_sum(arr);

        while(start < end){
            int mid = start + (end - start) / 2;
            int pieces = count_piece(arr, mid);

            if(pieces <= allowed_pieces) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int get_max(int[] arr) {
        int ans = arr[0];
        for(int val: arr) {
            if(val > ans) {
                ans = val;
            }
        }
        return ans;
    }

    static int get_sum(int[] arr) {
        int ans = 0;

        for(int val: arr) {
            ans += val;
        }
        return ans;
    }

    static int count_piece(int[] arr, int mid) {
        int sum = 0;
        int count = 1;

        for(int val: arr) {
            if(sum + val > mid) {
                count++;
                sum = 0;
            }
            sum += val;
        }

        return count;
    }

}
