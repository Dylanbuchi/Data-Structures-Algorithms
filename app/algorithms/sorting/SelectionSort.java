package app.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = (i + 1); j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

                swap(array, i, min);

            }
        }
        return array;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public static void main(String[] args) {
        int[] array = { 70, 30, 10, 50, 100, 5, 1 };
        int[] sortedArray = selectionSort(array);

        System.out.println(Arrays.toString(sortedArray));
    }
}