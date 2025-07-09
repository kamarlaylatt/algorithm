package Exercises.LinkedListEx1;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        var list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.reverse();

        System.out.println(Arrays.toString(list.toArray()));
    }
}