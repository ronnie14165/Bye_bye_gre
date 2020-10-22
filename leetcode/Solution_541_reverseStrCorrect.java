package leetcode;

public class Solution_541_reverseStrCorrect {
    public static String reverseStr(String s, int k) {
        int len = s.length();
        char c[] = new char[len];
        for (int i = 0; i < len; i++) {
            System.out.println("  "+i);
            if (i % (2 * k) < k / 2) {
                c[i] = s.charAt(i + k - 1 - i % (2 * k));
                c[i + k - 1 - i % (2 * k)] = s.charAt(i);
                System.out.println(i+"   "+c[i]);
                System.out.println(i + k - 1 - i % (2 * k)+"   "+c[i + k - 1 - i % (2 * k)]);
            } if (i % (2 * k) >= k) {
                c[i] = s.charAt(i);
                System.out.println(i + "   " + c[i]);
            } else if (c[i] == '\u0000') {
                c[i] = s.charAt(i);
                System.out.println(i + "   " + c[i]);
            }
            String t = new String(c);

            System.out.println(t);

        }
        String y = new String(c);
        return y;
    }

    public static void main(String[] args) {

        System.out.println(reverseStr("abcd", 4));
    }
}
