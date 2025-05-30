package BinaryTree;

public class BST {

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    private Node root;

    public BST(){}

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null) {
            Node newNode = new Node(value);
            return newNode;
        }

        if(value < node.value) {
            node.left = insert(value, node.left);
        }

        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    private int height(Node node){
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root Node value");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Value to the left of " + node.value + " is ");
        display(node.right, "Value to the right of " + node.value + " is ");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    public void populateSorted(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }


}
