package leetcode;

public class Solution_121_maxProfit {
    public static int max(int[] prices, int index) {
        int max = prices[index];
        for (int i = index + 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }

        }
        return max;
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = max(prices, i) - prices[i];

        }
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,54,4,6,2,6,2,4};
        int[] b = {3,2,1,0};
        System.out.println(maxProfit(a));
        System.out.println(maxProfit(b));
    }

}
