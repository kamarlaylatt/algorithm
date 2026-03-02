package Questions.TwoSum.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        // target 9
        int[] nums = { 2, 7, 3, 4 };
        var result = twoSumWithHashMap(nums, 7);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
            System.out.println(map);
        }

        return new int[0]; // No solution found
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index = 0;
        for (int i = index; i < nums.length; i++) {

            for (int j = (index + 1); j < nums.length; j++) {
                // System.out.println(i + j);
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }

            }
            index++;
        }

        return result;
    }
}
