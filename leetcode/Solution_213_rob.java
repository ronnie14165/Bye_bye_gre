package leetcode;

public class Solution_213_rob {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else if (nums.length == 3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }
        int[] dp1 = new int[nums.length];
        dp1[0] = nums[0];
        dp1[1] = nums[1];
        for (int i = 2; i < nums.length - 1; i++) {
            int max = dp1[i - 1];
            for (int j = 0; j <= i - 2; j++) {
                if (max < dp1[j] + nums[i]) {
                    max = dp1[j] + nums[i];
                }
            }
            dp1[i] = max;
        }
        int max1 = dp1[nums.length-2];

        int[] dp2 = new int[nums.length];
        dp2[1] = nums[1];
        dp2[2] = nums[2];
        for (int i = 3; i < nums.length; i++) {
            int max = dp2[i - 1];
            for (int j = 0; j <= i - 2; j++) {
                if (max < dp2[j] + nums[i]) {
                    max = dp2[j] + nums[i];
                }
            }
            dp2[i] = max;
        }
        int max2 = dp2[nums.length-1];

        return Math.max(max1, max2);
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 9, 3, 1};
        System.out.println(rob(a));
    }
}

