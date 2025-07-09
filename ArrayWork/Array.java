package ArrayWork;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it
        // Add the new item at the end

        if (items.length == count) {
            // Create a new array (twice the size)
            // Copy all the existing items
            // Set "items" to this new array

            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;
    }

    public int indexOf(int item) {
        // If we find it, return index
        // Otherwise, return -1
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void removeAt(int index) {
        // Validate the index
        // Shift the items to the left to fill the hole

        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
        System.out.println();
    }
}
