package leetcode;

public class Solution_258_addDigits {
    public static int addDigits(int num) {
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        while (result >= 10) {
            num = result;
            result = 0;
            while (num != 0) {
                result += num % 10;
                num /= 10;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
