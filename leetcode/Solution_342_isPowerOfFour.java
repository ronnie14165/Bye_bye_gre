package leetcode;

public class Solution_342_isPowerOfFour {
    public static boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        while (num > 1) {
            if (num % 4 != 0 && num != 1) {
                return false;
            }
            num /= 4;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(6));
    }
}
