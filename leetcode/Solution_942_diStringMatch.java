package leetcode;

public class Solution_942_diStringMatch {
    public static int[] diStringMatch(String S) {
        int[] array = new int[S.length() + 1];
        int low = 0;
        int high = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                array[i] = low++;
            } else {
                array[i] = high--;
            }
        }
        array[S.length()] = low;
        return array;
    }
}
