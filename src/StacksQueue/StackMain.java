package StacksQueue;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception{
        DynammicStack stack = new DynammicStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(33);

        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
