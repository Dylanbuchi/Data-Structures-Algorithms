package app.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 2, 4, 0, 54, 9, 5, 1 };
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j);
                    isSorted = false;
                }

            }
            if (isSorted) {
                return;
            }
        }
    }

    private static void swap(int[] array, int j) {
        int temp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = temp;
    }

}