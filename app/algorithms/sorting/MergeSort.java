package app.algorithms.sorting;

public class MergeSort {

    public void mergeSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        mergeSort(array, left, right);
    }

    private void mergeSort(int[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    private void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int leftIndex = start;
        int rightIndex = mid + 1;
        int i = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            if (array[leftIndex] < array[rightIndex]) {
                temp[i++] = array[leftIndex++];

            } else {
                temp[i++] = array[rightIndex++];

            }

        }

        if (leftIndex <= mid) {
            while (leftIndex <= mid) {
                temp[i++] = array[leftIndex++];

            }
        } else if (rightIndex <= end) {
            while (rightIndex <= end) {
                temp[i++] = array[rightIndex++];

            }
        }

        for (int j = 0; j < temp.length; j++) {
            array[start + j] = temp[j];
        }
    }

    public static void main(String[] args) {
        int[] array = { 9, 7, 5, 4, 3, 2, 100, 0, -12 };
        MergeSort mg = new MergeSort();

        mg.mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}