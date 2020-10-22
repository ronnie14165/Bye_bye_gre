package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution_804_uniqueMorseRepresentations {
    public static int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> myset = new HashSet<>();
        for (String s:words) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                temp.append(morse[s.charAt(i) - 'a']);
            }

            myset.add(temp.toString());
        }
        return myset.size();

        //        for (int i = 0; i < words.length; i++) {
//            String temp = "";
//            for (int j = 0; j < words[i].length(); j++) {
//                temp += morse[words[i].charAt(j) - 'a'];
//            }
//            myset.add(temp);
//        }
    }

    public static void main(String[] args) {
        String a[] = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(a));
    }
}
