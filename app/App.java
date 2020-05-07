/**
 * App
 */
package app;

import app.data_structure.Heap;

public class App {

    public static void main(String[] args) {

        var heap = new Heap();

        heap.insert(17);
        heap.insert(5);
        heap.insert(10);
        heap.insert(4);
        heap.insert(22);
        System.out.println("Done");
    }

}