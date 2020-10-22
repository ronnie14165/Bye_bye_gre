package leetcode;

import java.util.HashSet;

public class Solution_771_numJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        HashSet<Character> Jhash = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            Jhash.add(J.charAt(i));
        }
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Jhash.contains(S.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
