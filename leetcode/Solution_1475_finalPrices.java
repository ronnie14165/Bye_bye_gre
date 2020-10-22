package leetcode;

public class Solution_1475_finalPrices {
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int a[] = {8, 4, 6, 2, 3};
        finalPrices(a);
//        System.out.println(prices[0]);
//        System.out.println(prices[1]);
//        System.out.println(prices[2]);
//        System.out.println(prices[3]);
//        System.out.println(prices[4]);
    }
}
