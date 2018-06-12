class GenericLinkedList<T> {
    private Node<T> tail;
    private int nodeCount = -1;


    void printList() {
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

    void addToList(T[] values) {
        for (T value : values) {
            this.addToList(value);
        }
    }

    void addToList(T value) {
        if (this.nodeCount == -1) {
            this.tail = new Node<>(value);
        } else {
            Node cursor = this.tail;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = new Node<>(value);
        }
        this.nodeCount++;
    }

    void delFromListByIndex(int index) {
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

    T getValueByIndex(int index) {
        if (index > this.nodeCount || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> cursor = this.tail;
        for (int i = 1; i <= index; i++) {
            cursor = cursor.next;
        }
        return cursor.value;
    }


    private class Node<E> {
        private E value;
        private Node<E> next;


        Node(E value) {
            this.value = value;
        }
    }
}
