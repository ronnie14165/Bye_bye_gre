package leetcode;

public class Solution_746_minCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        int result = 0;
        for (int i = 2; i < cost.length; i++) {
            int temp = Math.min(dp[i - 1], dp[i - 2]);
            dp[i] += temp;
            dp[i] += cost[i];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]) ;
    }

    public static void main(String[] args) {
        int[] a = {10, 15, 20};
        int[] b = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(a));
        System.out.println(minCostClimbingStairs(b));
    }
}
