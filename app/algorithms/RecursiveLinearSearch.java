package app.algorithms;

public class RecursiveLinearSearch {

    public static int recursiveLinearSearch(int x, int i, int[] array) {
        if (i > array.length - 1) {
            return -1;
        } else if (array[i] == x) {
            return i;
        } else {
            return recursiveLinearSearch(x, i + 1, array);
        }

    }

    public static void main(String[] args) {

        int[] array = { 13, 24, 356, 47, 58 };
        int x = 47;
        int index = recursiveLinearSearch(x, 0, array);

        String message = index != -1 ? "the index for value " + x + " is " + index
                : "the value does not exist in this array";

        System.out.println(message);

    }

}