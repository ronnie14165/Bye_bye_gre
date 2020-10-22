package leetcode;

public class Solution_372_superPow_TE {
    public static int superPow(int a, int[] b) {
        if (b == null) {
            return a % 1337;
        }
        int temp = 1;
        a %= 1337;
        for (int i = 0; i < b.length; i++) {
            for (long j = 0; j < b[i] * Math.pow(10,(b.length - 1 - i)); j++) {
                temp %= 1337;
                temp *= a;
            }

        }
        return temp %= 1337;
    }
}
