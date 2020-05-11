/**
 * App
 */
package app;

import app.data_structure.DoublyLinkedList;
import app.data_structure.Heap;

public class App {

    public static void main(String[] args) {

        var list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addFirst(13);
        list.addFirst(155);
        list.addLast(12);
        list.insertAfter(155, 43);
        list.print();

    }

}