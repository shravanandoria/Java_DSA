package Binary_Search;

import java.util.Arrays;

public class BS_2DArray_2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target = 9;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] binary_search(int[][] arr, int row, int cStart, int cEnd, int target) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(arr[row][mid] == target) {
                return new int[] {row, mid};
            }

            if(target > arr[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1) {
            return binary_search(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }

            if(target > matrix[mid][cMid] ) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if(target == matrix[rStart][cMid]) {
            return new int[] {rStart, cMid};
        }

        if(target == matrix[rStart + 1][rEnd]) {
            return new int[] {rStart + 1, rEnd};
        }

        if(target <= matrix[rStart][cMid - 1]) {
            return binary_search(matrix, rStart, 0, cMid - 1, target);
        }

        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binary_search(matrix, rStart, cMid + 1, cols - 1, target);
        }

        if(target <= matrix[rStart + 1][cMid - 1]) {
            return binary_search(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binary_search(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
