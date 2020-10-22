package leetcode;

import java.util.HashSet;

public class Solution_804_uniqueMorseRepresentationsFaster {
    public static int uniqueMorseRepresentations(String[] words) {
        //why faster? change name morse-?d 3ms->1ms
        String d[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        for (String w:words) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < w.length(); i++) {
                temp.append(d[w.charAt(i) - 'a']);
            }

            s.add(temp.toString());
        }
        return s.size();

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
