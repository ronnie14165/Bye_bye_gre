package leetcode;

public class Solution_367_isPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            double mid = left + (right - left) / 2;
            if (mid == num / mid) {
                return true;
            }
            if (mid > num / mid) {
                right = (int)mid - 1;
            }
            if (mid < num / mid) {
                left = (int) mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}
