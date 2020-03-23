/**
 * App
 */
package app;

import app.data_structure.PriorityQueue;

public class App {

    public static void main(String[] args) throws Exception {
        PriorityQueue pq = new PriorityQueue();
        pq.insert(1);
        pq.insert(2);
        pq.insert(3);
        pq.insert(4);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
    }

}