package leetcode;

import java.util.*;

public class Solution_1207_uniqueOccurrencesCorrect {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mymap.containsKey(arr[i])) {
                int temp = mymap.get(arr[i]);
                mymap.replace(arr[i], temp + 1);
            } else {
                mymap.put(arr[i], 1);
            }

        }
        Collection<Integer> values = mymap.values();
        ArrayList<Integer> listOfValues = new ArrayList<>(values);
        listOfValues.sort(Comparator.naturalOrder());
        for (int i = 1; i < listOfValues.size(); i++) {
            if (listOfValues.get(i-1) == listOfValues.get(i)) {
                return false;
            }
        }
        System.out.println(listOfValues);
        return true;
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
