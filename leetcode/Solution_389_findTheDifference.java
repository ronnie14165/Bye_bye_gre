package leetcode;

import java.util.Arrays;

public class Solution_389_findTheDifference {
    public static char findTheDifference(String s, String t) {
        char sarray[] = s.toCharArray();
        char tarray[] = t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        for (int i = 0; i < sarray.length; i++) {
            if (sarray[i] != tarray[i]) {
                return tarray[i];
            }
        }
        return tarray[t.length() - 1];
    }

}
