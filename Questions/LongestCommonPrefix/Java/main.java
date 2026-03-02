package Questions.LongestCommonPrefix.Java;

public class main {
    public static void main(String[] args) {
        String[] input = { "cir", "car" };
        var output = longestPrefix(input);
        System.out.println(output);
    }

    private static String longestPrefix(String[] input) {
        String result = "";
        String tmp = "";
        for (int i = 0; i < input.length; i++) {
            if (i == 0 || input.length == 1) {
                result = input[0];
            } else {
                for (int j = 0; j < input[i].length(); j++) {
                    if (j + 1 > result.length() || j + 1 > input[i].length()) {
                        break;
                    }
                    if (result.charAt(j) == input[i].charAt(j)) {
                        tmp += input[i].charAt(j);
                    } else {
                        break;
                    }
                }
                result = tmp;
                tmp = "";
            }

        }
        return result;
    }
}
