package app.data_structure;

/**
 * LinkedList
 */
public class MyLinkedList {

    private class Node {

        private Node next;
        private int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public void insertAtHead(int data) {
        var node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;

        }
        size++;
    }

    public void removeAtIndex(int position) throws Exception {
        listIsEmpty();
        if (position <= 0 || position > size) {
            throw new Exception("Invalid position");

        }
        if (size == 1) {
            head = tail = null;

        }

        if (position == 1) {
            removeAtHead();

        } else {

            Node prev = null;
            var temp = head;

            while (position != 1) {
                prev = temp;
                temp = temp.next;
                position--;
            }
            prev.next = prev.next.next;

            tail = prev;
        }
        size--;

    }

    public void removeAtTail() throws Exception {
        listIsEmpty();

        if (size == 1) {
            head = tail = null;
        } else {

            var prev = head;
            var temp = head.next;

            while (temp.next != null) {
                prev = prev.next;
                temp = temp.next;

            }

            prev.next = null;
            tail = prev;
            temp = null;

        }
        size--;
    }

    public void insertAtTail(int data) {
        var node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;

        }
        size++;
    }

    public void insertAtPosition(int data, int position) throws Exception {
        var node = new Node(data);

        if (position <= 0 || position > size) {
            throw new Exception("Invalid position");

        }
        if (isEmpty()) {
            head = tail = node;
        } else {
            var temp = head;

            while (position != 1) {
                temp = temp.next;
                position--;

            }

            temp.data = node.data;
            tail = temp;

        }
    }

    public int size() {
        return size;
    }

    public int search(int data) throws Exception {
        listIsEmpty();

        int count = 1;
        var temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Item was found at position " + count + "\nitem: ");
                return temp.data;
            }
            temp = temp.next;

        }
        throw new Exception("Item was not found!");

    }

    public void removeAtHead() throws Exception {
        listIsEmpty();

        var temp = head;
        head = head.next;
        temp = null;

        size--;
    }

    @Override
    public String toString() {
        var string = new StringBuilder();
        var current = head;

        while (current != null) {
            if (current.next == null) {
                string.append("[" + current.data + "] ");
            } else {
                string.append("[" + current.data + "], ");
            }

            current = current.next;
        }

        return string.toString();
    }

    private void listIsEmpty() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}