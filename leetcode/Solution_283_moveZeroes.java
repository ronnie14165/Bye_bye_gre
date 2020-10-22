package leetcode;

public class Solution_283_moveZeroes {
    public static void moveZeroes(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            }

        }
        int index = nums.length - 1;
        for (int i = 0; i < nums.length-zero; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = 0;
                index--;
            }
        }

        for (int i = 0; i < nums.length-zero; i++){
            for (int j = i + 1; j < nums.length - zero; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
        }
    }
}
