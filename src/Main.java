import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println(search_matrix_max(matrix));
    }


    static int search_matrix_max(int[][] arr) {
        if(arr.length == 0 ){
            return -1;
        }

        int ans = -1;
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > ans) {
                    ans = arr[row][col];
                }
            }
        }

        return ans;
    }

    static int[] search_matrix(int[][] arr, int target) {
        if(arr.length == 0 ){
            return new int[] {-1, -1};
        }

        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }

        return new int[] {-1, -1};
    }

    static boolean search(String text, char target) {
        if(text.length() < 1) {
            return false;
        }

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }



}