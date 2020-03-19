package app.data_structure;

import java.util.Arrays;

/**
 * Stack
 */
public class Stack {

    private int[] stack;
    private int size;

    public Stack() {
        size = 0;
        stack = new int[10];
    }

    public void push(int data) {
        if (size == stack.length) {
            var array = new int[size * 2];
            for (int i = 0; i < stack.length; i++) {
                array[i] = stack[i];

            }

        }

        stack[size++] = data;

    }

    public boolean isEmpty() {
        return stack.length == 0;

    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        return stack[--size];

    }

    @Override
    public String toString() {
        var copy = Arrays.copyOfRange(stack, 0, size);
        return Arrays.toString(copy);
    }

}