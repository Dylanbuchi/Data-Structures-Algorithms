package app.data_structure;

/**
 * LinkedList
 */
public class LinkedList {

    private class Node {

        private Node next;
        private int value;

        private Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        size = 0;

    }

    public void size() {
        System.out.println(size);
    }

    public int indexOf(int data) {
        int index = 0;

        while (first != null) {
            if (first.value == data)
                return index;
            first = first.next;
            index++;

        }
        return -1;
    }

    public void addFirst(int data) {
        var node = new Node(data);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;

        }

    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int data) {
        var node = new Node(data);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;

        }

    }

    public void print() {

        while (first != null) {

            System.out.println(first.value);
            first = first.next;
        }

    }

}