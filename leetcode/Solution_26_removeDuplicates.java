package leetcode;

public class Solution_26_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }
        int result = 1;
        int index = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != index) {
                index = nums[i];
                nums[result] = index;
                result++;
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        int[] b = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
        System.out.println(removeDuplicates(b));
    }

}
