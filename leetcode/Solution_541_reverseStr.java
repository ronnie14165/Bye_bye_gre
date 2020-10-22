package leetcode;

public class Solution_541_reverseStr {
    public static String reverseStr(String s, int k) {
        int len = s.length();
        char c[] = new char[len];
        for (int i = 0; i < len; i++) {
            System.out.println(" "+i);
            if (i % (2 * k) < k / 2) {
                c[i] = s.charAt(i + k - 1 - i % (2 * k));
                System.out.println(i+"   "+c[i]);

                c[i + k - 1 - i % (2 * k)] = s.charAt(i);
                System.out.println(i + k - 1 - i % (2 * k)+"   "+c[i + k - 1 - i % (2 * k)]);
            } else if (i % (2 * k) >= k) {
                c[i] = s.charAt(i);
                System.out.println(i + "   " + c[i]);
            }

        }
        for (int i = 0; i <7 ; i++) {
            System.out.println(c[i]);
        }
        String y = c.toString();
        System.out.println(y);
        return y;
    }

    public static void main(String[] args) {

        System.out.println(reverseStr("abcdefgh", 2));
        //System.out.println(reverseStr("abcdefg", 3));
    }
}
