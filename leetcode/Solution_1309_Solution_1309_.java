package leetcode;

public class Solution_1309_Solution_1309_ {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if ('1' <= s.charAt(i) && s.charAt(i) <= '9') {
                sb.append((char)('a' + s.charAt(i) - '1'));
            } else if (s.charAt(i) == '#' && i >= 2) {
                int temp = (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0';
                sb.append((char) ('a' - 1 + temp));
                i -= 2;
            }
        }
        sb.reverse();
        String str = sb.toString();
        return str;
    }
}
