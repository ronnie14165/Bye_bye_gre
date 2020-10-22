package leetcode;

import java.util.HashSet;

public class Solution_1207_uniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int[] array = new int[2001];
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            array[arr[i] + 1000]++;

        }
        for (int i = 0; i < array.length&&array[i] != 0; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < 2001 && array[i] != 0; i++) {
            System.out.println(array[i]);
            if (set.contains(array[i])) {
                return false;
            } else {
                set.add(array[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        int[] b = {1,2,2,1,1,3};
        int[] c = {1,2};
        System.out.println(uniqueOccurrences(a));
        System.out.println(uniqueOccurrences(b));
        System.out.println(uniqueOccurrences(c));
    }
}
