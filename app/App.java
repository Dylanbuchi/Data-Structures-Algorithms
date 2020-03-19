/**
 * App
 */
package app;

import java.util.Arrays;

import app.data_structure.Stack;

public class App {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.pop();

        System.out.println(stack);

    }
}