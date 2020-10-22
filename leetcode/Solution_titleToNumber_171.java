package leetcode;

import org.w3c.dom.ls.LSOutput;

public class Solution_titleToNumber_171 {
    public static int titleToNumber(String s) {
        int[] array = new int[s.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i) - 64;
            System.out.println(array[i]);
        }
        int results = 0;
        for (int i = 0; i < array.length; i++) {
            results += array[i]*Math.pow(26,array.length-i-1);
        }
        return results;
    }

    public static void main(String[] args) {
        String a = "ZY";
        System.out.println(titleToNumber(a));
        //System.out.println((int)'A');
    }
}
