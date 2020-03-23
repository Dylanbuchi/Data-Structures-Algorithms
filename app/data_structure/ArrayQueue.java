package app.data_structure;

import java.util.Arrays;

/**
 * Queue
 */
public class ArrayQueue {
    private int count;
    private int[] queue;
    private int front;
    private int end;

    public ArrayQueue(int capacity) {
        this.count = 0;
        this.front = 0;
        this.end = 0;
        this.queue = new int[capacity];

    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;

        }
        return false;

    }

    public boolean isFull() {
        if (count == queue.length) {
            return true;

        }
        return false;

    }

    public int peak() {
        return queue[front];

    }

    public void enqueue(int data) throws Exception {
        if (count == queue.length) {
            throw new Exception("Array is full");

        }
        queue[end] = data;
        end = (end + 1) % queue.length;
        count++;

    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        var item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;
    }

    @Override
    public String toString() {

        return Arrays.toString(queue);
    }

}