package leetcode;

import static java.lang.Integer.min;

public class Solution_1189_maxNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) == 'a') {
                a++;
            }
            else if (text.charAt(i) == 'b') {
                b++;
            }
            else if (text.charAt(i) == 'l') {
                l++;
            }
            else if (text.charAt(i) == 'o') {
                o++;
            }else if (text.charAt(i) == 'n') {
                n++;
            }

        }
        o /= 2;
        l /= 2;
        int result1 = min(b, a);
        int result2 = min(l, o);
        int result3 = min(result1, result2);
        int result = min(result3, n);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("balloon213fasdnoollab"));
    }
}
