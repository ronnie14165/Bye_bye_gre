package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Solution_1122_relativeSortArrayStupid {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!list2.contains(arr1[i])) {
                list3.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            int temp = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (list1.get(j) == temp) {
                    list2.add(list2.indexOf(temp), temp);
                }
            }
            list2.remove(list2.indexOf(temp));
        }
        list3.sort(Comparator.naturalOrder());
        for (int i = 0; i < list3.size(); i++) {
            list2.addLast(list3.get(i));
        }
        int res[] = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = list1.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int arr2[] = {2, 1, 4, 3, 9, 6};
        //relativeSortArray(arr1, arr2);
        System.out.println(relativeSortArray(arr1, arr2));
    }

}
