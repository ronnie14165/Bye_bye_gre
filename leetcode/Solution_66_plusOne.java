package leetcode;

public class Solution_66_plusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = 0;
        while (i < len) {
            if (digits[i] != 9) {
                break;
            } else if (i == len - 1 && digits[i] == 9) {
                int res[] = new int[len + 1];
                res[0] = 1;
                for (int j = 1; j < res.length; j++) {
                    res[j] = 0;
                }
                return res;

            } else {
                i++;
            }
        }
        i = len - 1;
        while (i >= 0) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
                i--;
            }
        }
        return digits;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        System.out.println(plusOne(a)[2]);
        System.out.println(plusOne(a)[1]);
        System.out.println(plusOne(a)[2]);
        int b[] = {9};
        System.out.println(plusOne(b)[0]);

    }
}
