package leetcode;

public class Solution_8_myAtoi {
    public static int myAtoi(String str) {
        int sig = 1;
        int result = 0;
        boolean act = false;
        if (str.charAt(0) == '-') {
            sig = -1;
        } else if ('0' < str.charAt(0) && str.charAt(0) <= '9') {
            result *= 10;
            result += (int) str.charAt(0) - '0';
        } else if (str.charAt(0) == ' ') {
            act = false;
        } else {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            if ('0' < str.charAt(i) && str.charAt(i) <= '9') {
                result *= 10;

                result += (int) str.charAt(i)-'0';
            }else if (str.charAt(0) == ' ') {

            } else {
                return result * sig;
            }
        }
        return result * sig;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("a-4132"));
    }
}
