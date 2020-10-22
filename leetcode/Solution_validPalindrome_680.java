package leetcode;

public class Solution_validPalindrome_680 {
    public static boolean validPalindrome(String s) {
        if (isPalindrome(s, 0, s.length()-1)) {
            return true;
        }
        int min = 0, max = s.length()-1;
        while (min < max) {
            if (s.charAt(min++) != s.charAt(max--)) {
                min--;
                max++;
                if (isPalindrome(s, min, max - 1) || isPalindrome(s, min + 1, max)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //String a = "abcba";
        System.out.println(validPalindrome("abcc00ba"));
        //System.out.println(isPalindrome("abccabba",0,7));
    }
}
