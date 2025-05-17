package OOPS.generics.comparing;

import java.util.ArrayList;

public class LamdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            arr.add(i + 1);
        }


        arr.forEach((item) -> {
            System.out.println(item * 2);
        });

        Operation sum = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LamdaFunctions lam = new LamdaFunctions();

        lam.op(2,3, sum);
        lam.op(2,3, mul);
        lam.op(2,3, sub);


    }

    private int op(int a, int b, Operation op) {
        return op.operation(a,b);
    }

}

interface Operation {
    int operation(int a, int b);
}
