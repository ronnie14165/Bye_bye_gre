package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_isPalindrome_125 {

    private final static HashSet<Character> mySet = new HashSet<>(
            Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'));


    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int count = 0;
        while (i < j) {
            while (i<j&&!mySet.contains(s.charAt(i))) {
                i++;
                count++;
            }

            while (i<j&&!mySet.contains(s.charAt(j))) {
                j--;
                count++;
            }

            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;

            }else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z' && s.charAt(i) - s.charAt(j) == 32) {
                i++;
                j--;
            }else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z' && s.charAt(j) - s.charAt(i) == 32) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("P0"));
        System.out.println(isPalindrome("Aa"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println((int)'A');
        System.out.println((int)'a');



    }

}
