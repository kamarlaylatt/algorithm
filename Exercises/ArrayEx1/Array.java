package Exercises.ArrayEx1;

import java.util.Arrays;

public class Array {
    public int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {

        if (count == items.length) {
            var newArr = new int[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newArr[i] = items[i];
            }
            items = newArr;
        }

        items[count++] = item;
    }

    public int indexOf(int item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public void print() {
        // System.out.println(Arrays.toString(items));
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
        System.out.println();
    }
}
