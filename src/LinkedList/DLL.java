package LinkedList;

public class DLL {

    private Node head;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("Nothing to delete");
            return;
        }

        if(head.next == null) {
            head = null;
        }

        Node node = head;
        for (int i = 1; i < size - 1; i++) {
            node = node.next;
        }
        node.next = null;
        size--;
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("Nothing to delete");
            return;
        }

        head = head.next;
        if(head != null) {
            head.previous = null;
        }
        size--;
    }

    public void insertAfter(int after, int value) {
        Node prev = find(after);

        if(prev == null) {
            System.out.println("cannot find this value");
            return;
        }

        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
        node.previous = prev;
        if(node.next != null) {
            node.next.previous = node;
        }
        size++;
    }

    public void insert(int value, int index) {
        if(head == null) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        if(index > size) {
            System.out.println("Invalid Index Number");
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        node.previous = temp;
        if(node.next != null) {
            node.next.previous = node;
        }
        temp.next = node;
        size++;
    }

    public Node find(int value) {
        Node temp = head;
        while(temp != null) {
            if(temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }

        return temp;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if(head != null) {
            head.previous = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;

        Node last = head;

        if(head == null) {
            node.previous = null;
            head = node;
            size++;
            return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.previous = last;
        size++;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.previous;
        }

        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
