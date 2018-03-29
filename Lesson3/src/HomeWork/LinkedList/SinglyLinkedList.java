package HomeWork.LinkedList;


public class SinglyLinkedList {
    private Node tail;
    private int nodeCount = -1;


    public void printList() {
        if (nodeCount == -1) {
            System.out.print("List is empty");
        } else {
            Node cursor = this.tail;
            for (int i = 0; i <= this.nodeCount; i++) {
                System.out.print(cursor.value + "|");
                cursor = cursor.next;
            }
        }
        System.out.println();
    }

    public void addToList(int[] values) {
        for (int value : values) {
            this.addToList(value);
        }
    }

    public void addToList(int value) {
        if (this.nodeCount == -1) {
            this.tail = new Node(value);
        } else {
            Node cursor = this.tail;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = new Node(value);
        }
        this.nodeCount++;
    }

    public void delFromListByIndex(int index) {
        if (index > this.nodeCount || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            if (this.nodeCount != 0) {
                this.tail = this.tail.next;
            } else {
                this.tail = null;
            }
        } else {
            Node cursor = this.tail;
            Node prev = null;
            for (int i = 1; i <= index; i++) {
                prev = cursor;
                cursor = cursor.next;
            }
            prev.next = cursor.next;
        }
        this.nodeCount--;
    }

    public int getValueByIndex(int index) {
        if (index > this.nodeCount || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node cursor = this.tail;
        for (int i = 1; i <= index; i++) {
            cursor = cursor.next;
        }
        return cursor.value;
    }


    private class Node {
        private int value;
        private Node next;


        Node(int value) {
            this.value = value;
        }
    }
}
