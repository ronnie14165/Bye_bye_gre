package leetcode;

public class Solution_1491_average {
    public static double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }
        double res = (sum - min - max) / (double)(salary.length - 2);
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(res);
        System.out.println(salary.length - 2);

        return res;
    }

    public static void main(String[] args) {
        int a[] = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
        System.out.println(average(a));
    }
}
