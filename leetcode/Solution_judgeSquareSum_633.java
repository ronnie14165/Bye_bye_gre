package leetcode;

public class Solution_judgeSquareSum_633 {
    public static boolean judgeSquareSum(int c) {

        int max = (int)Math.sqrt(c);
        int min = 0;
        while (min <= max) {
            if (min * min + max * max == c) {
                return true;
            } else if (min * min + max * max < c) {
                min++;
            } else if (min * min + max * max > c) {
                max--;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        System.out.println(judgeSquareSum(26));
    }

}
