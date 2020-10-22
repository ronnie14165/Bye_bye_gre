package leetcode;

public class Solution_69_mySqrt {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x/mid && x/(mid+1) < mid + 1) {
                return mid;
            }
            if (mid > x/mid) {
                right = mid - 1;
            }
            if (x / (mid + 1) >= mid + 1) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
