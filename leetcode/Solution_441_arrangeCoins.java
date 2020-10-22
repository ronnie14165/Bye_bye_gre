package leetcode;

public class Solution_441_arrangeCoins {
    public static int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        int left = 1;
        int right = n;
        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if ((mid / 2) <= (n / (mid + 1)) && n / (mid + 1) < (mid + 2) / 2) {
//                return mid;
//            }
//            if ((mid / 2) > (n / (mid + 1)) {
//                right = mid - 1;
//            }
//            if ((mid + 1) >= (mid + 2) / 2) {
//                left = mid + 1;
//            }


//            int mid = left + (right - left) / 2;
//            if (mid <= (2 * n) / (mid + 1) && (2 * n) / (mid + 1) < mid + 2) {
//                return mid;
//            }
//            if (mid > (2 * n) / (mid + 1)) {
//                right = mid - 1;
//            }
//            if ((2 * n) / (mid + 1) >= mid + 2) {
//                left = mid + 1;
//            }
//            System.out.println(left);
//            System.out.println(right);
//            System.out.println(mid);
            float mid = left + (right - left) / 2;

            if (mid <= n / (mid + 1) *2 && n / (mid + 1)*2 < mid + 2) {
                return (int)mid;
            }
            if (mid > n / (mid + 1)*2) {
                right = (int)mid - 1;
            }
            if (n / (mid + 1)*2 >= mid + 2) {
                left = (int)mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));

    }
}
