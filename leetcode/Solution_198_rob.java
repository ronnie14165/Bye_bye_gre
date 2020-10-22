package leetcode;

public class Solution_198_rob {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int max = dp[i - 1];
            for (int j = 0; j <= i - 2; j++) {
                if (max < dp[j] + nums[i]) {
                    max = dp[j] + nums[i];
                }
            }
            dp[i] = max;
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 9, 3, 1};
        System.out.println(rob(a));
    }
}
