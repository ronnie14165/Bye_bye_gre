package leetcode;

public class Solution_1185_dayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        int result = 0;
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 1971; i < year; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                result += 366;
            } else {
                result += 365;
            }
            System.out.println("----------");
            System.out.println(i+"   "+result);

        }
        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                result += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                result += 30;
            } else if  (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                result += 29;
            } else {
                result += 28;
            }
            System.out.println("----------");
            System.out.println(i+"   "+result);
        }
        result += day+5-1;
        System.out.println("----------");
        System.out.println("   "+result);
        return week[result % 7];

    }

    public static void main(String[] args) {
//        System.out.println(dayOfTheWeek(31,8,2019));
//        System.out.println(dayOfTheWeek(18,7,1999));
//        System.out.println(dayOfTheWeek(15,8,1993));
//        System.out.println(dayOfTheWeek(1,1,1971));
        System.out.println(dayOfTheWeek(21,12,1980));
    }
}
