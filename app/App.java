/**
 * App
 */
package app;

import java.util.Arrays;

import app.data_structure.LinkedList;

public class App {

    public static void main(String[] args) {
        var list = new LinkedList();

        var array = list.toArray();
        System.out.println(list.getKthfromTheEnd(1));
    }
}