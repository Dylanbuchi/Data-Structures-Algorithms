package app.data_structure;

import java.util.Arrays;

/**
 * PriorityQueue
 */
public class PriorityQueue {
    private int[] queue;
    private int count;

    public PriorityQueue() {
        this.count = 0;
        this.queue = new int[5];
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();

        }
        queue[--count] = 0;
        return queue[--count];

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(int data) {

        isFull();

        int i = shiftDataToPut(data);
        queue[i] = data;
        count++;

    }

    private int shiftDataToPut(int data) {
        int i = 0;
        for (i = count - 1; i >= 0; i--) {
            if (queue[i] > data) {
                queue[i + 1] = queue[i];

            } else {
                break;
            }

        }
        return i + 1;
    }

    private boolean isFull() {
        if (count == queue.length) {
            var array = new int[queue.length * 2];
            for (int i = 0; i < queue.length; i++) {
                array[i] = queue[i];

            }
            queue = array;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        return Arrays.toString(queue);
    }

}