package leetcode;

public class Solution_8_myAtoi_rewrite {
    public static int myAtoi(String str) {
        int sig = 1;
        long result = 0;
        boolean act = false;
        for (int i = 0; i < str.length(); i++) {
            if ('0' < str.charAt(i) && str.charAt(i) <= '9') {
                result *= 10;
                result += (int) str.charAt(i)-'0';
            } else if (str.charAt(i) == '0'&& !act) {
                act = true;
            } else if (str.charAt(i) == '0'&& !act) {
                result *= 10;
                result += (int) str.charAt(i)-'0';
            } else if (str.charAt(i) == '-' && !act) {
                sig = -1;
                act = true;
            } else if (str.charAt(i) == '+' && !act) {
                sig = 1;
                act = true;
            } else if (str.charAt(i) == ' ' && !act) {

            } else {
                if (result >= -2147483648 && 2147483647 >= result)
                    return (int) result * sig;
                else if (sig > 0) {
                    return 2147483647;
                } else {
                    return -2147483648;
                }
            }
        }
        if(result > -2147483648 && 2147483647 > result)
            return (int)result * sig;
        else if (sig > 0) {
            return 2147483647;
        } else {
            return -2147483648;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));
    }
}
