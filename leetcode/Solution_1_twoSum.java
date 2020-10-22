package leetcode;

import java.util.Arrays;
public class Solution_1_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int[] array = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
        }

        Arrays.sort(array);

        //System.out.println(array[0]+" "+array[1]+" "+array[2]);

        int i = 0, j = array.length - 1;
        while (i < j) {
            int sum_temp = array[i] + array[j];
            if (sum_temp == target) {
                int temp1 = 0, temp2 = 0;
                for (int ii = 0; ii < nums.length; ii++)
                {
                    if (nums[ii] == array[i]) {
                        temp1 = ii;
                    }
                }
                for (int ii = 0; ii < nums.length; ii++)
                {
                    if (nums[ii] == array[j] && ii != temp1) {
                        temp2 = ii;
                    }
                }


                return new int[]{temp1, temp2};
            }
            else if (sum_temp < target) {
                i++;
            } else if (sum_temp > target) {
                j--;
            }
        }
        return null;
    }
}
