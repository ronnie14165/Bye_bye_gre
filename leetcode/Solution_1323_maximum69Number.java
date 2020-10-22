package leetcode;

import java.util.Stack;

public class Solution_1323_maximum69Number {
    public static int maximum69Number(int num) {
        Stack s = new Stack();
        while (num > 0) {
            int i = num % 10;
            num /= 10;
            s.push(i);
        }
        int result = 0;
        while (!s.empty()) {
            if ((int) s.peek() == 6) {
                result *= 10;
                result += 9;
                s.pop();
                while (!s.empty()) {
                    result *= 10;
                    result += (int) s.peek();
                    s.pop();
                }
            } else {
                result *= 10;
                result += (int) s.peek();
                s.pop();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(666669));
    }
}
