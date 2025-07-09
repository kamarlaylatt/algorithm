package Stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String inputs) {

        if (inputs == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch : inputs.toCharArray()) {
            stack.push(ch);
        }

        StringBuffer reversed = new StringBuffer();

        while (!stack.empty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
