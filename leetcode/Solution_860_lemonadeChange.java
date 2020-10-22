package leetcode;

public class Solution_860_lemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                five--;
                ten++;
            } else {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
            if (five < 0 || ten < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(a));
    }
}
