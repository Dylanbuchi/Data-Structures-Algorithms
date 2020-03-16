/**
 * App
 */
package app;

import app.data_structure.Array;

public class App {

    public static void main(String[] args) {
        Array a = new Array(2);
        a.insert(10);
        a.insert(20);
        a.insert(30);

        a.removeAt(1);

        a.print();

        System.out.println("index of number 10 : " + a.indexOf(10));
    }
}