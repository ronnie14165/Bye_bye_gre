package leetcode;

public class Solution_283_moveZeroes_temp {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length-1 ; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
    }
}
