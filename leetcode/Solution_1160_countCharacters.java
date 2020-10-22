package leetcode;

import java.util.HashMap;

public class Solution_1160_countCharacters {
    public static int countCharacters(String[] words, String chars) {
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> mymap = new HashMap<>();
            for (int j = 0; j < chars.length(); j++) {
                if (mymap.containsKey(chars.charAt(j))) {
                    mymap.replace(chars.charAt(j), mymap.get(chars.charAt(j)) + 1);
                } else {
                    mymap.put(chars.charAt(j), 1);
                }
            }
            boolean add = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (mymap.containsKey(words[i].charAt(j)) && mymap.get(words[i].charAt(j)) > 0) {
                    mymap.replace(words[i].charAt(j), mymap.get(words[i].charAt(j)) - 1);
                } else {
                    add = false;
                }
            }
            if (add) {
                res += words[i].length();
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String a[] = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        //String a[] = {"cat", "bt", "hat", "tree"};
        String b = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        //String b = "atach";
        System.out.println(countCharacters(a, b));
    }

}
