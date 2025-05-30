package StacksQueue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }

        ptr++;
        this.data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty!!");
        }

//        int removed = this.data[ptr];
//        ptr--;
//        return removed;
        return this.data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot Peek from An Empty Stack!!");
        }

        return this.data[ptr];
    }

    public boolean isFull(){
        return ptr == this.data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
