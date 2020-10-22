package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_isPalindrome_125_Copy {

    private final static HashSet<Character> mySet = new HashSet<>(
            Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'));


    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

//        while (i < j) {
//            if (mySet.contains(s.charAt(i++))) {
//                if (mySet.contains(s.charAt(j--))) {
//                    if (s.charAt(i - 1) != s.charAt(j + 1)) {
//                        return false;
//                    }
//                }
//            }
//        }

        while (i < j) {
            while (i<j&&!mySet.contains(s.charAt(i))) {
                i++;
            }

            while (i<j&&!mySet.contains(s.charAt(j))) {
                j--;
            }

            if (s.charAt(i) == s.charAt(j)||s.charAt(i) == s.charAt(j)+32||s.charAt(i) == s.charAt(j)-32) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        //System.out.println((int)' ');
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome("a 0d0  A"));
        System.out.println(isPalindrome("adccc a"));
        System.out.println(isPalindrome("aabbaa"));


    }

}
