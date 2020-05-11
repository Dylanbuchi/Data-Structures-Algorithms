package app.data_structure;

/**
 * DoublyLinkedList
 */
public class DoublyLinkedList<T> {

    private static class Node<T> {

        private Node<T> next;
        private Node<T> prev;
        private T data;

        private Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            tail = node;
        } else {
            head.prev = node;
        }
        node.next = head;
        head = node;

    }

    public void addLast(T data) {
        var node = new Node<>(data);
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;

    }

    public Node<T> deleteFirst() {
        var temp = head;
        if (isEmpty()) {
            return null;
        }
        if (temp.next == null) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        return temp;

    }

    public Node<T> deleteLast() {
        var temp = tail;
        if (isEmpty()) {
            return null;
        }
        if (head.next == null) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        return temp;

    }

    public boolean insertAfter(T key, T data) {
        var current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        var node = new Node<>(data);

        if (current == tail) {
            current.next = null;
            tail = node;
        } else {
            node.next = current.next;
            current.next.prev = node;

        }

        node.prev = current;
        current.next = node;

        return true;

    }

    public Node<T> deleteKey(T key) {
        var current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == head) {
            head = current.next;

        } else {
            current.prev.next = current.next;
        }

        if (current == tail) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }

        return current;

    }

    public void print() {
        var temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}