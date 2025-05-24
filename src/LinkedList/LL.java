
package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }

        if(index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);

        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;

        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        int value = tail.value;
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

//    QUESTIONS
    public void duplicates() {
        Node node = head;

        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }

    public int lengthCycle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                } while(temp != slow);

                return length;
            }
        }

        return 0;
    }

    public Node get(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }

    public void bubbleSort(int row, int col){
        if(row == 0) {
            return;
        }

        if(col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value) {
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second == tail){
                    Node prev = get(col - 1);
                    first.next = second.next;
                    second.next = first;
                    prev.next = second;
                    tail = first;
                } else {
                    Node prev = get(col - 1);
                    first.next = second.next;
                    second.next = first;
                    prev.next = second;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public void reverse(Node node){
        if(node == tail) {
            head = tail;
            return;
        }

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverse(){

        if(size < 2) {
            return;
        }

        Node previous = null;
        Node present = head;
        Node next = present.next;

        while(present != null) {
            present.next = previous;
            previous = present;
            present = next;
            if(next != null){
                next = next.next;
            }

            head = previous;
        }
    }

    public void reversePart(int left, int right){
        if(left == right) {
            return;
        }

        Node prev = null;
        Node current = head;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null) {
                next = next.next;
            }
        }

        if(last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
    }

    public boolean isPlaindrome(){
        Node mid = getMid(head);
        Node headSecond = reverse1(mid);
        Node reReverseHead = headSecond;

        while(head != null && headSecond != null) {
            if(head.value != headSecond.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverse1(reReverseHead);
        return head == null || headSecond == null;
    }

    public Node reverse1(Node head){
        Node prev = null;
        Node current = head;
        Node next = current.next;

        while(current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null) {
                next = next.next;
            }
        }

        return prev;
    }

    public Node getMid(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reOrder(){
        if(head == null && head.next == null) {
            return;
        }

        Node mid = getMid(head);
        Node hs = reverse1(mid);

        Node hf = head;

        while(hf != null && hs != null) {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if(hf != null) {
            hf.next = null;
        }
    }

    public Node reOrderKGroup(int k){
        if(k <= 1) {
            return head;
        }

        Node prev = null;
        Node current = head;

        while(true) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            int count = 0;
            for (int i = 0; current != null && i < k; i++) {
                count++;
                current.next = prev;
                prev = current;
                current = next;
                if(next != null) {
                    next = next.next;
                }
            }

            if(last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;

            if(current == null){
                break;
            }

            if(nodeLength() - count < k) {
                break;
            }
        }
        return head;
    }

    public Node reOrderAlternateKGroup(int k) {
        if(k <= 1 || head == null) {
            return null;
        }

        Node prev = null;
        Node current = head;
        int count = 0;

        while(current != null) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                count++;
                current.next = prev;
                prev = current;
                current = next;
                if(next != null) {
                    next = next.next;
                }
            }

            if(last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;

            if(nodeLength() - count < k) {
                break;
            }

            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
                if(next != null) {
                    next = next.next;
                }
            }
        }
        return head;
    }

    public int nodeLength(){
        Node temp = head;
        int num = 0;
        while(temp != null) {
            temp = temp.next;
            num++;
        }

        return num;
    }

    public Node rotate(int k){
        if(k == 0) {
            return head;
        }

        Node nodeHead = head;

        int length = nodeLength();

        Node prev = null;
        Node current = head;
        Node next = current.next;

        for(int i = 0; i < length - k; i++) {
            prev = current;
            current = next;
            next = next.next;
        }

        Node ans = current;

        if(prev != null) {
            prev.next = null;
        }

        while(current != null) {
            prev = current;
            current = current.next;
        }

        prev.next = nodeHead;
        nodeHead = ans;
        return ans;
    }


    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertLast(8);
//        list.insertLast(5);
//        list.insertLast(2);
//        list.insertLast(6);
//        list.insertLast(7);
//        list.insertLast(1);
//        list.insertLast(3);
//        list.insertLast(4);
//
//        list.display();
////        list.bubbleSort();
//        list.reverse();
//        list.display();

//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(4);
//        list.insertLast(5);
//
//        list.display();
//        list.reversePart( 2, 4);
//        list.display();

//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(1);
//        System.out.println(list.isPlaindrome());


        LL list = new LL();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        Node ans = list.rotate(2);
        while(ans != null){
            System.out.print(ans.value + "->");
            ans = ans.next;
        }

    }
}