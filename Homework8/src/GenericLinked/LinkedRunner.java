package GenericLinked;

public class LinkedRunner {

    public static void main(String[] args) {
        GenericLinkedList<String> sList = new GenericLinkedList<>();
        String[] randomStrArray = {"abc", "def", "ghi", "xyz"};
        sList.addToList(randomStrArray);
        sList.addToList("qpr");
        sList.printList();
        System.out.println(sList.getValueByIndex(3));
        sList.delFromListByIndex(3);
        sList.printList();
        sList.delFromListByIndex(0);
        sList.printList();

        GenericLinkedList<Integer> iList = new GenericLinkedList<>();
        Integer[] randomIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        iList.addToList(randomIntArray);
        iList.addToList(11);
        iList.printList();
        System.out.println(iList.getValueByIndex(3));
        iList.delFromListByIndex(3);
        iList.printList();
        iList.delFromListByIndex(0);
        iList.printList();

    }
}
