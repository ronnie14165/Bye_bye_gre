package leetcode;

public class Solution_1221_balancedStringSplit {
    public static int balancedStringSplit(String s) {
        int result = 0;
        int l = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                result++;
                l = 0;
                r = 0;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        String s = "RRRRLLLLRLRLRLLLRR";
        System.out.println(balancedStringSplit(s));

    }
}
