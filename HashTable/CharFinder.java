package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    public char findFirstRepeatingChar(String str) {
        Set<Character> set = new HashSet<>();

        var chars = str.toCharArray();
        for (var ch : chars) {
            System.out.println(set);
            if (set.contains(ch))
                return ch;
            set.add(ch);
        }

        System.out.println(set);

        return Character.MIN_VALUE;
    }
}
