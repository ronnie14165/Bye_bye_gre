package leetcode;

public class Solution_smallerNumbersThanCurrent_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i] > nums[j]) {
                    results[i]++;

                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,21,3,1,1};
        System.out.println(smallerNumbersThanCurrent(a)[3]);
    }
}
