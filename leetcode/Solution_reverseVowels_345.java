package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_reverseVowels_345 {

    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));


    public static String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        char[] s1 = new char[s.length()];
        int i = 0, j = s.length()-1;
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {
                s1[i++] = ci;
            } else if (!vowels.contains(cj)) {
                s1[j--] = cj;
            } else {
                s1[i++] = cj;
                s1[j--] = ci;
            }
        }
        return new String(s1);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));;
    }

}
