package StacksQueue;

public class DynammicStack extends CustomStack {

    public DynammicStack(){
        super();
    }

    public DynammicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item){
        if(isFull()){

            int[] arr = new int[this.data.length * 2];
            for (int i = 0; i < data.length; i++) {
                arr[i] = data[i];
            }

            data = arr;
        }

        return super.push(item);
    }
}
