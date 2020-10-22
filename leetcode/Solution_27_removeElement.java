package leetcode;

public class Solution_27_removeElement {
    public static int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(a, 2));
    }
}
