package app.algorithms;

public class Linear {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };
        int x = 90;
        int index = findIndexOfValue(x, array);

        String message = index != -1 ? "the index for value " + x + " is " + index
                : "the value does not exist in this array";

        System.out.println(message);

    }

    public static int findIndexOfValue(int x, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {

                return i;
            }

        }
        return -1;
    }

}