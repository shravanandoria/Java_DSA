package BinaryTree;

public class AVL {


    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public AVL(){}


    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null){
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
        return rotate(node);
    }

    private Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1) {
//            Left Heavy
            if(height(node.left.left) - height(node.left.right) > 0){
//                LEFT-LEFT Case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < - 1) {
//            Right Heavy Case
            if(height(node.right.left) - height(node.right.right) < 0) {
//                Right-Right Case
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0) {
//                Right-Left Case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root node value is ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "The left of " + node.value + " is ");
        display(node.right, "The right of " + node.value + " is ");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }
}
