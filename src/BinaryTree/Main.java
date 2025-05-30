package BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BST tree = new BST();

//        int[] arr = {15, 10, 5, 6, 8, 12, 20, 4};
//        tree.populate(arr);
//        tree.display();

//        int[] arr = {1,2,3,4,5,6,7,8};
//        tree.populateSorted(arr, 0, arr.length);
//        tree.display();

//        AVL tree = new AVL();
//        for (int i = 0; i < 1000; i++) {
//            tree.insert(i);
//        }
//        System.out.println(tree.height());
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();
        System.out.println(tree.query(1, 6));
    }

}
