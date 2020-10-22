package leetcode;

public class Solution_744_nextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length - 1;
        int left = 1;
        int right = len;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid - 1] <= target && letters[mid] > target) {
                return letters[mid];
            }
            if (target >= letters[mid]) {
                left = mid + 1;
            }
            if (letters[mid - 1] > target) {
                right = mid - 1;
            }

        }
        return letters[0];
    }


    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j','z'},'d'));
    }
}
