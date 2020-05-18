package app.algorithms.sorting;

import java.util.Arrays;

/**
 * InsertionSort
 */
public class InsertionSort {

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 70, 30, 10, 50, 100, 5, 1 };
        int[] sortedArray = insertionSort(array);

        System.out.println(Arrays.toString(sortedArray));
    }
}