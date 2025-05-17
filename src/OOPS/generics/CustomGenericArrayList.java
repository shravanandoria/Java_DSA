package OOPS.generics;

import java.util.Arrays;
import java.util.List;

public class CustomGenericArrayList<T extends Number> {

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    void add(T data){
        if(isFull()) {
            resize();
        }

        this.data[size++] = data;
    }

    private boolean isFull(){
        return size == this.data.length;
    }

    private void resize(){
        Object[] temp = new Object[size * 2];
        for (int i = 0; i < this.data.length; i++) {
            temp[i] = this.data[i];
        }

        this.data = temp;
    }

    public void getList(List<? extends Number> list) {

    }

    public T remove() {
       T remove = (T)(this.data[--size]);
       return remove;
    }

    public T get(int index) {
        return (T)(this.data[index]);
    }

    public void set(int index, T value) {
        this.data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();


        for (int i = 0; i < 14; i++) {
            list.add(i * 2);
        }
        System.out.println(list);
    }

}
