package StacksQueue;

public class circularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(200);
        queue.display();




        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();

    }
}
