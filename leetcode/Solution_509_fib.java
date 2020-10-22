package leetcode;

public class Solution_509_fib {
    public static int fib(int N) {
//        if (N == 0) {
//            return 0;
//        }
//        if (N == 1) {
//            return 1;
//        } else {
//            return fib(N - 1) + fib(N - 2);
//        }

        int res[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040};
        return res[N];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 31; i++) {
            System.out.print(fib(i)+",");
        }

    }
}
