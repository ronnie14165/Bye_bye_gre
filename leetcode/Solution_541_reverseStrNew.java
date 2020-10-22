package leetcode;

public class Solution_541_reverseStrNew {
    public static String reverseStr(String s, int k) {
        int len = s.length();
        System.out.println(len);

        if (k == 1) {
            return s;
        }
        if (k > len) {
            char c[] = new char[len];
            for (int i = 0; i < len; i++) {
                c[i] = s.charAt(len - 1 - i);
            }
            String y = new String(c);
            return y;
        }

        char c[] = new char[len];
        for (int i = 0; i < len; i++) {
            c[i] = s.charAt(i);
        }
        for (int i = 0; i < len; i++) {
            if (i % (2 * k) < k / 2 && i / (2 * k) * 2 * k + k - i % (2 * k) - 1 < len) {
                char temp = c[i];
                c[i] = c[i / (2 * k) * 2 * k + k - i % (2 * k) - 1];
                c[i / (2 * k) * 2 * k + k - i % (2 * k) - 1] = temp;
            }

        }
        String y = new String(c);
        return y;
    }

    public static void main(String[] args) {

        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl"
                , 39));
    }
}
