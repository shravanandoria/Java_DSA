package StacksQueue;

public class DynammicQueue extends CircularQueue {

    public DynammicQueue(){
        super();
    }


    public DynammicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            int[] arr = new int[this.data.length * 2];
            for (int i = front ; i < data.length; i++) {
                arr[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = arr;
        }
        return super.insert(item);
    }
}
