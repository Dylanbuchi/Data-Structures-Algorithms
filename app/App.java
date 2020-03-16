/**
 * App
 */
package app;

import java.util.ArrayList;

import app.data_structure.Array;
import app.data_structure.LinkedList;

public class App {

    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println(list.indexOf(3));

    }
}