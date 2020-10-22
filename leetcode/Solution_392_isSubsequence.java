package leetcode;

import java.util.Stack;
import java.util.LinkedList;

public class Solution_392_isSubsequence {
    public static boolean isSubsequence(String s, String t) {
        Stack s_stack=new Stack();
        Stack t_stack=new Stack();
        for (int i = 0; i < s.length(); i++) {
            s_stack.push(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            t_stack.push(t.charAt(i));
        }
        while (true) {

            if (s_stack.empty()) {
                return true;
            } else if (t_stack.empty()) {
                return false;
            }


            if (s_stack.peek() == t_stack.peek()) {
                s_stack.pop();
                t_stack.pop();
            } else {
                t_stack.pop();
            }


        }
    }

    public static void main(String[] args) {
        String a = "1236";
        String b = "12345";

        boolean t = isSubsequence(a, b);
        System.out.println(t);
    }
}
