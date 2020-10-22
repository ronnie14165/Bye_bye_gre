package leetcode;

public class Solution_704_search {
    public static int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int len = nums.length-1;
        int left = 0;
        int right = len;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={-1, 0, 3, 5, 9, 12};

        System.out.println(search(a,55));
    }
}
