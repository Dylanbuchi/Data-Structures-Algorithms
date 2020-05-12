package app.algorithms;

public class LinearSearch {

    public static int linearSearch(int x, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {

                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = { 13, 24, 356, 47, 58 };
        int x = 47;
        int index = linearSearch(x, array);

        String message = index != -1 ? "the index for value " + x + " is " + index
                : "the value does not exist in this array";

        System.out.println(message);

    }

}