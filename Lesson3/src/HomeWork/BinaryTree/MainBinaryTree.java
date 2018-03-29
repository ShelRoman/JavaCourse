package HomeWork.BinaryTree;

import java.util.Random;

public class MainBinaryTree {

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        int[] randomArray = new Random().ints(15, 1, 1000).toArray();
        bTree.add(randomArray);
//        bTree.add(3);
//        bTree.add(5);
//        bTree.add(6);
//        bTree.add(8);
//        bTree.add(10);
//        bTree.add(4);
//        bTree.add(7);
        bTree.printTree();
    }
}
