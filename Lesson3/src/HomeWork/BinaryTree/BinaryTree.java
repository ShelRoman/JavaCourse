package HomeWork.BinaryTree;

public class BinaryTree {
    private Node root;


    public void add(int[] values) {
        for (int value : values) {
            add(value);
        }
    }

    public void add(int value) {
        if (this.root == null) {
            this.root = new Node(value);
        } else {
            add(value, this.root, this.root);
        }
    }

    public Node getRoot() {
        return this.root;
    }

    private void add(int value, Node ancestor, Node comparable) {
        if (comparable == null) {
            comparable = new Node(value);
            if (ancestor.getValue() > comparable.getValue()) {
                ancestor.left = comparable;
            } else {
                ancestor.right = comparable;
            }
        } else {
            if (value > comparable.value) {
                add(value, comparable, comparable.right);
            } else if (value < comparable.value) {
                add(value, comparable, comparable.left);
            } else {
                System.out.println("Value - " + value + " is already in a tree");
            }
        }
    }

    public boolean isInTree(Node cursor, int value) {
        if (cursor != null) {
            if (cursor.getValue() == value) {
                return true;
            } else {
                return isInTree(cursor.getLeft(), value) || isInTree(cursor.getRight(), value);
            }
        }
        return false;
    }


    public void printTree() {
        this.printNode(this.root);

    }

    private void printNode(Node printNode) {
        if (printNode == null) {
            System.out.println("Empty");
        } else {
            System.out.println("Value is " + printNode.getValue());
            System.out.println("Left of " + printNode.getValue());
            this.printNode(printNode.left);
            System.out.println("Right of " + printNode.getValue());
            this.printNode(printNode.right);
        }
    }


    public class Node {
        private Node left;
        private Node right;
        private int value;


        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }


        private Node(int value) {
            this.value = value;
        }


        public int getValue() {
            return this.value;
        }

        private boolean hasLeft() {
            return this.left != null;
        }

        private boolean hasRight() {
            return this.right != null;
        }
    }


}
