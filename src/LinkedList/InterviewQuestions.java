package LinkedList;

public class InterviewQuestions {

    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                ListNode temp = slow;
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

    public ListNode findStart(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                } while(temp != slow);
                break;
            }
        }

        if(length == 0) {
            return null;
        }

        ListNode f = head;
        ListNode s = head;

        while(length > 0) {
            f = f.next;
            length--;
        }

        while(f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(n);
            fast = findSquare(findSquare(n));
        } while(slow != fast);

        if(slow == 1) {
            return true;
        }

        return false;
    }

    public int findSquare(int n) {
        int ans = 0;

        while(n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }

        return ans;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(){}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}