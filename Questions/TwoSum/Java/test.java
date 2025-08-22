package Questions.TwoSum.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8 };
        int target = 66;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int minusValue = target - nums[i];
            if (map.containsKey(minusValue)) {
                var result = new int[] { map.get(minusValue), i };
                System.out.println(Arrays.toString(result));
                break;
            }
            map.put(nums[i], i);
        }
    }
}