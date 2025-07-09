package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] numbers = new int[3];
        // int[] numbers = { 10, 20, 30, 40 };
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        ;
        // list.remove(0);
        System.out.println(list);
        // System.out.println(list.toArray());
        System.out.println(list.size());
        System.out.println(list.indexOf(20));

    }
}
