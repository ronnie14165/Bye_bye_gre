package leetcode;

public class Solution_268_missingNumber {
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int res = (len + 1) * len / 2;
        for (int i = 0; i < len; i++) {
            res -= nums[i];
        }
        return res;
    }
}
