package app.data_structure;

/**
 * Array
 */
public class Array {

    private int[] array;
    private int count;

    public Array(int size) {

        this.array = new int[size];
        this.count = 0;
    }

    public void removeAt(int index) {

        if (index >= count || index < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public void insert(int num) {
        if (count == array.length) {
            int[] biggerArray = new int[count * 2];

            for (int i = 0; i < array.length; i++) {
                biggerArray[i] = array[i];

            }
            array = biggerArray;
        }
        array[count++] = num;
    }

    public int indexOf(int num) {
        for (int i = 0; i < count; i++) {
            if (array[i] == num) {
                return i;
            }

        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);

        }
    }
}