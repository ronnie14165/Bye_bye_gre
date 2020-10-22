package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_412_fizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            String temp = String.valueOf(i);
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(temp);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int x = 100;
        for (int i = 0; i < x; i++) {
            System.out.println(fizzBuzz(x).get(i));
        }
    }
}
