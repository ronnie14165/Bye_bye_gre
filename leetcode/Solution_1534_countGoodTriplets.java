package leetcode;
//0 <= i < j < k < arr.length
//        |arr[i] - arr[j]| <= a
//        |arr[j] - arr[k]| <= b
//        |arr[i] - arr[k]| <= c
public class Solution_1534_countGoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        sum += 1;
                    }
                }
            }
        }
        return sum;
    }
}
