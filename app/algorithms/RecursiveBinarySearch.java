package app.algorithms;

import java.util.Arrays;

/**
 * BinarySearch
 */
public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int x, int[] array, int front, int back) {
        if (front > back) {
            return -1;
        } else {
            int mid = (front + back) / 2;
            int midValue = array[mid];

            if (midValue == x) {
                return mid;
            } else if (midValue > x) {
                return recursiveBinarySearch(x, array, front, mid - 1);

            } else {
                return recursiveBinarySearch(x, array, mid + 1, back);
            }
        }
    }

    public static void main(String[] args) {

        int[] array = { 34, 56, 7, 83, 0, -56, 56, 789, 8 };
        Arrays.sort(array);

        int x = 34;
        int front = 0;
        int back = array.length - 1;
        int index = recursiveBinarySearch(x, array, front, back);

        String message = index != -1 ? "the index for value " + x + " is " + index
                : "the value does not exist in this array";

        System.out.println(message);
    }
}