package HashTable;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        // map.put(1, "Mosh");
        // map.put(2, "John");
        // map.put(3, null);
        // map.put(null, null);
        // map.put(null, null);
        // map.remove(null);

        // System.out.println(map);

        // CharFinder finder = new CharFinder();
        // var ch = finder.findFirstNonRepeatingChar("a green apple");
        // System.out.println(ch);

        // Set<Integer> set = new HashSet<>();
        // int[] numbers = { 1, 2, 3, 3, 2, 1, 4 };
        // for (var number : numbers)
        // set.add(number);
        // System.out.println(set);

        // CharFinder finder = new CharFinder();
        // var ch = finder.findFirstRepeatingChar("green apple");
        // System.out.println(ch);

        HashTable table = new HashTable();
        table.put(6, "A"); // 1
        table.put(8, "B"); // 3
        table.put(11, "C"); // 1
        table.put(6, "A+");
        table.remove(6);
        System.out.println(table.get(10));
    }
}
