package HomeWork.LinkedList;

public class DoublyLinkedList {
    private Node tail;
    private Node head;
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

    public void addToHead(int[] values) {
        for (int value : values) {
            this.addToHead(value);
        }
    }

    public void delFromListByIndex(int index) {
        if (index > this.nodeCount || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            this.tail = this.tail.next;
            this.tail.prev = null;
        } else if (index == nodeCount) {
            this.head = this.head.prev;
            this.head.next = null;
        } else {
            if (index > this.nodeCount / 2) {
                this.delFromHead(index);
            } else {
                this.delFromTail(index);
            }
        }
        nodeCount--;
    }

    private void delFromTail(int index) {
        Node cursor = this.tail;
        Node prev = null;
        for (int i = 1; i <= index; i++) {
            prev = cursor;
            cursor = cursor.next;
        }
        assert prev != null;
        prev.next = cursor.next;
        prev.next.prev = prev;
    }

    private void delFromHead(int index) {
        Node cursor = this.head;
        Node next = null;
        for (int i = this.nodeCount - 1; i >= index; i--) {
            next = cursor;
            cursor = cursor.prev;
        }
        assert next != null;
        next.prev = cursor.prev;
        next.prev.next = next;
    }

    public int getValueByIndex(int index) {
        if (index > this.nodeCount || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return this.tail.value;
        } else if (index == nodeCount) {
            return this.head.value;
        } else {
            if (index > this.nodeCount / 2) {
                return this.searchValueFromHead(index);
            } else {
                return this.searchValueFromTail(index);
            }
        }
    }

    private int searchValueFromTail(int index) {
        Node cursor = this.tail.next;
        for (int i = 1; i < index; i++) {
            cursor = cursor.next;
        }
        return cursor.value;
    }

    private int searchValueFromHead(int index) {
        Node cursor = this.head.prev;
        for (int i = this.nodeCount - 1; i > index; i--) {
            cursor = cursor.prev;
        }
        return cursor.value;
    }

    public void addToHead(int value) {
        if (this.nodeCount == -1) {
            this.addFirst(value);
        } else {
            Node node = new Node(value, this.head, null);
            this.head.next = node;
            this.head = node;
        }
        this.nodeCount++;
    }

    public void addToTail(int[] values) {
        for (int value : values) {
            this.addToTail(value);
        }
    }

    public void addToTail(int value) {
        if (this.nodeCount == -1) {
            this.addFirst(value);
        } else {
            Node node = new Node(value, null, this.tail);
            this.tail.prev = node;
            this.tail = node;
        }
        this.nodeCount++;
    }

    private void addFirst(int value) {
        Node init = new Node(value, null, null);
        this.head = init;
        this.head.prev = init;
        this.tail = init;
        this.tail.next = init;
    }


    private class Node {
        private Node next;
        private Node prev;
        private int value;

        Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }
}
