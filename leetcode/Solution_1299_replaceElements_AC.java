package leetcode;

public class Solution_1299_replaceElements_AC {



    public static int max(int[] arr, int index) {
        int max = arr[index+1];
        for (int i = index+1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = max(arr, i);
        }
        arr[arr.length-1] = -1;
        return arr;

    }

    public static void main(String[] args) {
        int[] a = {17,18,5,4,6,1};
        replaceElements(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
