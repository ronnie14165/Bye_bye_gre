package leetcode;

public class Solution_1313_decompressRLElist {
    public static int[] decompressRLElist(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i += 2) {
            num += nums[i];
        }
        int[] array = new int[num];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                array[index] = nums[i + 1];
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        decompressRLElist(a);

    }
}
