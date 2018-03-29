package HomeWork.LinkedList;

import java.util.Random;

public class MainLinkedList {

    public static void main(String[] args) {
        //SinglyLinkedList
//        SinglyLinkedList sList = new SinglyLinkedList();
//        int[] randomArray = new Random().ints(10, 1, 1000).toArray();
//        sList.addToList(randomArray);
//        sList.printList();
//        System.out.println(sList.getValueByIndex(3));
//        sList.delFromListByIndex(3);
//        sList.printList();
//        sList.delFromListByIndex(0);
//        sList.printList();

        //DoublyLinkedList
        DoublyLinkedList dList = new DoublyLinkedList();
        DoublyLinkedList dList2 = new DoublyLinkedList();
        int[] randomArray = new Random().ints(10, 1, 1000).toArray();
        dList.addToTail(randomArray);
        dList.printList();
        System.out.println(dList.getValueByIndex(3));
        System.out.println(dList.getValueByIndex(7));
        dList2.addToHead(randomArray);
        dList2.printList();
        System.out.println(dList2.getValueByIndex(3));
        System.out.println(dList2.getValueByIndex(7));
        dList.delFromListByIndex(3);
        dList.printList();
        dList2.delFromListByIndex(7);
        dList2.printList();

    }
}
