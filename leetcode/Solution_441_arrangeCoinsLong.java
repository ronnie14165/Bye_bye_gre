package leetcode;

public class Solution_441_arrangeCoinsLong {
    public static int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        long left = 1;
        long right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;

            if ((mid + 1) * mid / 2 <= n && n < (mid + 1) * (mid + 2) / 2) {
                return (int) mid;
            }
            if ((mid + 1) * mid / 2 > n) {
                right = mid - 1;
            }
            if (n >= (mid + 1) * (mid + 2) / 2) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));

    }
}
