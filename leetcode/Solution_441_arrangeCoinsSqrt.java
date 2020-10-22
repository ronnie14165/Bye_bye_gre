package leetcode;

public class Solution_441_arrangeCoinsSqrt {
    public static int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        double left = 1;
        double right = (int)(Math.sqrt(n)*Math.sqrt(2))+10;

        while (left <= right) {
            double mid = (int) (left + (right - left) / 2);
            System.out.println(left+"left");
            System.out.println(right+"right");
            System.out.println(mid+"mid");


            if ((mid + 1) * (mid / 2) <= n && n < (mid + 1) * (mid + 2) / 2) {
                System.out.println("done");
                return (int) mid;
            }
            if ((mid + 1) * (mid / 2) > n) {
                System.out.println("on the left");

                right = mid - 1;
            }
            if (n >= (mid + 1) * (mid + 2) / 2) {
                left = mid + 1;
                System.out.println("on the right");
            }System.out.println("-----------");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));

    }
}
