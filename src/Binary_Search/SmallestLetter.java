package Binary_Search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'e','e','e','e','e','e','n','n','n','n'};
        System.out.println(search(arr, 'e'));
    }


    static char search(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        if(target >= arr[end]) {
            return arr[start];
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else {
                if(target == arr[mid]) {
                    if(arr[mid + 1] > target) {
                        return arr[mid + 1];
                    } else {
                        start = mid + 1;
                    }
                } else {
                    end = mid - 1;
                }
            }
        }

        return arr[start];
    }


}
