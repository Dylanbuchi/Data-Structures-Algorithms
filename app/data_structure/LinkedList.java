package app.data_structure;

import java.util.NoSuchElementException;

/**
 * LinkedList
 */
public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    private class Node {

        private Node next;
        private int value;

        private Node(int value) {
            this.value = value;
        }

    }

    public LinkedList() {
        size = 0;

    }

    public int getSize() {

        return size;
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
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;

    }

    public void addLast(int data) {
        var node = new Node(data);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;

        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();

        }

        size--;

        if (first == last) {
            first = last = null;
            return;
        }
        var temp = first.next;
        first.next = null;
        first = temp;

    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();

        }
        size--;

        if (first == last) {
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
        last = previous;
        last.next = null;

    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;

            current = current.next;

        }
        return null;
    }

    public void print() {

        while (first != null) {

            System.out.println(first.value);
            first = first.next;
        }

    }

    public int[] toArray() {

        var array = new int[size];
        var current = first;
        var index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;

        }
        return array;

    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }

        var previous = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthfromTheEnd(int k) {
        if (k >= size || k <= 0) {
            return -1;
        }
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;

        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
