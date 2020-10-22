package leetcode;

public class Solution_1470_shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        for (int i = 0; i < n; i ++) {
            array[2*i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            array[2*i + 1] = nums[i+n];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        shuffle(a, 4);

    }
}
