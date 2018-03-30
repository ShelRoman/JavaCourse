package HomeWork.BinaryTree;

import java.util.Random;

public class MainBinaryTree {

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        int[] randomArray = new Random().ints(10, 1, 30).toArray();
        bTree.add(randomArray);
        bTree.add(5);
//        bTree.add(3);
//        bTree.add(5);
//        bTree.add(6);
//        bTree.add(8);
//        bTree.add(10);
//        bTree.add(4);
//        bTree.add(7);
        bTree.printTree();
        System.out.println("Is value 5 is in a tree - " + bTree.isInTree(bTree.getRoot(), 5));
        System.out.println("Is value 33 is in a tree - " + bTree.isInTree(bTree.getRoot(), 33));

    }
}
