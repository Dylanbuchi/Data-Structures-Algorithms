package app.data_structure;

public class BinarySearchTree<E> {
    private static class Node<E> {

        private int key;
        private E data;
        private Node<E> leftChild;
        private Node<E> rightChild;

        private Node(int key, E data) {
            this.key = key;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    private Node<E> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public E findMin() {
        Node<E> temp, last;
        temp = root;
        last = null;

        while (temp != null) {
            last = temp;
            temp = temp.leftChild;
        }
        return last.data;
    }

    public E findMax() {
        Node<E> temp, last;
        temp = root;
        last = null;

        while (temp != null) {
            last = temp;
            temp = temp.rightChild;
        }
        return last.data;
    }

    public boolean remove(int key) {
        Node<E> temp = root;
        Node<E> parent = root;

        boolean isLeftChild = false;

        while (temp.key != key) {
            parent = temp;
            if (key <= temp.key) {
                isLeftChild = true;
                temp = temp.leftChild;

            } else {
                temp = temp.rightChild;
                isLeftChild = false;
            }
            if (temp == null) {
                return false;
            }
        }

        if (temp.leftChild == null && temp.rightChild == null) {
            if (temp == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }

        }

        else if (temp.rightChild == null) {
            if (temp == root) {
                root = temp.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = temp.leftChild;
            } else {
                parent.rightChild = temp.leftChild;
            }
        }

        else if (temp.leftChild == null) {
            if (temp == root) {
                root = temp.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = temp.rightChild;
            } else {
                parent.rightChild = temp.rightChild;
            }
        } else {

            Node<E> successor = getSuccessor(temp);

            if (temp == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = temp.leftChild;
        }
        return true;
    }

    private Node<E> getSuccessor(Node<E> nodeToDelete) {
        Node<E> parent = nodeToDelete;
        Node<E> successor = nodeToDelete;

        Node<E> temp = nodeToDelete.rightChild;
        while (temp != null) {
            parent = successor;
            successor = temp;
            temp = temp.leftChild;
        }
        if (successor != nodeToDelete.rightChild) {
            parent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }

        return successor;
    }

    public void insertRecursive(int key, E data) {
        root = insertRecursive(root, key, data);
    }

    private Node<E> insertRecursive(Node<E> root, int key, E data) {
        if (root == null) {
            root = new Node<>(key, data);

        } else if (key <= root.key) {
            root.leftChild = insertRecursive(root.leftChild, key, data);
        } else {
            root.rightChild = insertRecursive(root.rightChild, key, data);
        }
        return root;
    }

    public void insert(int key, E data) {
        Node<E> temp, node, parent;
        node = new Node<>(key, data);

        if (isEmpty()) {

            root = node;

        } else {

            temp = root;

            while (true) {

                parent = temp;

                if (key <= temp.key) {

                    temp = temp.leftChild;

                    if (temp == null) {

                        parent.leftChild = node;
                        return;
                    }

                } else {

                    temp = temp.rightChild;

                    if (temp == null) {

                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

}