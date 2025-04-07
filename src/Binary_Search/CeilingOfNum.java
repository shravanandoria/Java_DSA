package Binary_Search;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        char[] arr2 = {'c', 'f', 'j'};
        char target2 = 'f';
        int target = 1;

        System.out.println(search_char(arr2, target2));
//        System.out.println(search(arr, target));

    }
    static char search_char(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end  = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }


    static int search(int[] arr, int target) {
        if(target > arr[arr.length - 1]) {
            return -1;
        }

        if(arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            }
        }

        return start;
    }
}
