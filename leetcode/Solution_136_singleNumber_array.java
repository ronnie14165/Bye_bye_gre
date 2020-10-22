package leetcode;

import java.util.Arrays;

public class Solution_136_singleNumber_array {
    public static int singleNumber(int[] nums) {
        if (nums == null) {
            return 0;
        }
        Arrays.sort(nums);
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        int index = 0;
        while (index != nums.length) {
            if (nums[index] != nums[index + 1]) {
                return nums[index];
            }
        }
        return nums[0];
    }

}
