package leetcode;

public class Solution_1103_distributeCandiesCorrect {
    public static int[] distributeCandies(int candies, int num_people) {
        int[] array = new int[num_people];
        int temp = 1;
        int i = 0;
//        System.out.println(candies+"candy");
//        System.out.println(temp+"temp");
//        System.out.println(i+"i");
        while (candies > temp) {
            candies -= temp;
            array[i++ % num_people] += temp++;
        }
        array[i++ % num_people] += candies;
        return array;
    }

    public static void main(String[] args) {
        int a = 7, b = 4;
        System.out.println(distributeCandies(a, b));
    }
}
