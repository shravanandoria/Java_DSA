package StacksQueue;

import java.util.Arrays;

public class TwoStacks {
    public static void main(String[] args) {

    }

    static int twoStacks(int x, int[] a, int[] b){
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count){

        if(count > sum){
            return count;
        }

        if(a.length == 0 || b.length == 0){
            return count;
        }

        int left = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int right = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length),sum + b[0], count + 1 );

        return Math.max(left, right);
    }
}
