package leetcode;

public class Solution_1588_sumOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int len = 1; len <= arr.length; len += 2) {
            for (int i = 0; i < arr.length - len + 1; i++) {
                for (int j = i; j < i + len; j++) {
                    sum += arr[j];
                    //System.out.println(len + "   " + arr[j] + "   " + sum);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(a));
    }
}

