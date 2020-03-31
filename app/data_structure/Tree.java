package app.data_structure;

/**
 * Tree
 */
public class Tree {

    private static class Node {

        private int value;
        private Node leftChild;
        private Node rightChild;

        private Node(int value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;

        }

        @Override
        public String toString() {
            return "Node = " + value;

        }

    }

    private Node root;

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.leftChild == null && root.rightChild == null) {
            return 0;
        }
        return 1 + Math.max(height(root.leftChild), height(root.leftChild));

    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {

        if (root == null) {
            return;

        }

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);

    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {

        if (root == null) {
            return;

        }

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);

    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {

        if (root == null) {
            return;

        }
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);

    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;

            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }

        }
        return false;

    }

    public void insert(int value) {
        var temp = new Node(value);

        if (root == null) {
            root = temp;
            return;
        }

        var current = root;

        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = temp;
                    break;
                }
                current = current.leftChild;

            } else {
                if (current.rightChild == null) {
                    current.rightChild = temp;
                    break;
                }
                current = current.rightChild;
            }

        }

    }

}