package leetcode;

import java.util.Stack;

public class Solution_1281_subtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        Stack s = new Stack();
        while (n > 0) {
            int i = n % 10;
            n /= 10;
            s.push(i);
        }
        int add = 0, mul = 1;
        while (!s.empty()) {
            int temp = (int)s.peek();
            add += temp;
            mul *= temp;
            s.pop();

        }
        return mul-add;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

}
