package leetcode;

public class Solution_575_distributeCandies_runTimeError {
    public static int distributeCandies(int[] candies) {
        int result = 0;
        int[] hash = new int[100005];
        for (int i = 0; i < candies.length; i++) {
            hash[candies[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                result++;
            }
        }
        if (result > candies.length/2) {
            result = candies.length / 2;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] a1 = {1, 2, 2, 1, 1, 1,};
        System.out.println(distributeCandies(a));
        System.out.println(distributeCandies(a1));

    }
}
