package leetcode;

public class Solution_1464_maxProduct {
    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int index1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max1 = nums[i];
                index1 = i;
            }
        }
        nums[index1] = 0;
        int max2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
