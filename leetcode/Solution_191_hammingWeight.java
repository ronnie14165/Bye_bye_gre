package leetcode;

public class Solution_191_hammingWeight {
    public int hammingWeight(int n) {
        int temp = 0;
        int index = n;
        while (index > 0) {
            if (index % 2 == 0) {
                index /= 2;
            } else {
                index -= 1;
                temp++;
            }
        }
        return temp;
    }
}
