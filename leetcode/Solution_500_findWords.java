package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution_500_findWords {
    public static String[] findWords(String[] words) {
        HashSet<Character> myset1 = new HashSet<>();
        char line1[] = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p','Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};
        for (int i = 0; i < line1.length; i++) {
            myset1.add(line1[i]);
        }
        HashSet<Character> myset2 = new HashSet<>();
        char line2[] = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l','A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'};
        for (int i = 0; i < line2.length; i++) {
            myset2.add(line2[i]);
        }
        HashSet<Character> myset3 = new HashSet<>();
        char line3[] = {'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        for (int i = 0; i < line3.length; i++) {
            myset3.add(line3[i]);
        }
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            boolean firstLine = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!myset1.contains(words[i].charAt(j))) {
                    firstLine = false;
                }
            }
            boolean secLine = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!myset2.contains(words[i].charAt(j))) {
                    secLine = false;
                }
            }
            boolean thrLine = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!myset3.contains(words[i].charAt(j))) {
                    thrLine = false;
                }
            }
            if (firstLine || secLine || thrLine) {
                res.add(words[i]);
            }
        }
        String[] a = res.toArray(new String[res.size()]);
        return a;
    }

    public static void main(String[] args) {
        String a[] = {"Hello", "Alaska", "Dad", "Peace"};
        //findWords(a);
        System.out.println(findWords(a)[0]);
        System.out.println(findWords(a)[1]);

    }
}
