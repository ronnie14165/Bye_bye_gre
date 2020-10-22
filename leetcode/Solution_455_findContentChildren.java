package leetcode;

import java.util.Arrays;

public class Solution_455_findContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {0,0,3,4,5,6};
        System.out.println(findContentChildren(a, b));
    }
}
