package app.algorithms;

import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static int binarySearch(int x, int[] array) {
        int front, mid, back, midValue;

        front = 0;
        back = array.length - 1;

        while (front <= back) {
            mid = (front + back) / 2;
            midValue = array[mid];

            if (midValue == x) {
                return mid;

            } else if (midValue > x)
                back = mid - 1;
            else {
                front = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] array = { 34, 56, 7, 83, 0, -56, 56, 789, 8 };
        Arrays.sort(array);

        int x = 789;
        int index = (binarySearch(x, array));

        String message = index != -1 ? "the index for value " + x + " is " + index
                : "the value does not exist in this array";

        System.out.println(message);
    }
}