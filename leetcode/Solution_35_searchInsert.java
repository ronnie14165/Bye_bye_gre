package leetcode;

public class Solution_35_searchInsert {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 1;
        }
        if (target < nums[0]) {
            return 0;
        }
        int len = nums.length - 1;
        if (target > nums[len]) {
            return len + 1;
        }

        int left = 0;
        int right = len-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target && nums[mid + 1] >= target) {
                return mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid + 1] < target) {
                left = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1};
        int b = 1;
        System.out.println(searchInsert(a,b));
    }
}
