package leetcode;

public class Solution_441_arrangeCoinsSqrtDone {
    public static int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        double left = 1;
        double right = (int)(Math.sqrt(n)*Math.sqrt(2))+10;

        while (left <= right) {
            double mid = (int) (left + (right - left) / 2);


            if ((mid + 1) * (mid / 2) <= n && n < (mid + 1) * (mid + 2) / 2) {
                return (int) mid;
            }
            if ((mid + 1) * (mid / 2) > n) {
                right = mid - 1;
            }
            if (n >= (mid + 1) * (mid + 2) / 2) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));

    }
}
