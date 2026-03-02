package Questions.TwoSum.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 6, 8 };
        int target = 9;
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

        System.out.println(result[0] + "" + result[1]);
    }
}