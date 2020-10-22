package leetcode;

public class Solution_1185_dayOfTheWeek_AC {
    public static String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Thursday", "Friday", "Saturday","Sunday","Monday", "Tuesday", "Wednesday"};
        int i, days = 0;
        int[] monthdays= {31,28,31,30,31,30,31,31,30,31,30,31};
        //1971-1-1 周五
        for(i = 1971; i < year; ++i)
        {
            System.out.println(i+"   "+days);
            if((i%4 == 0 && i%100 != 0) || i%400 == 0)
                days += 366;
            else
                days += 365;
        }
        for(i = 0; i < month-1; ++i)
        {
            days += monthdays[i];
            System.out.println("----------");
            System.out.println(i+"   "+days);
        }
        days += day;
        if(((year%4 == 0 && year%100 != 0) || year%400 == 0) && month > 2)
            ++days;
        System.out.println("   "+days);
        return week[days%7];


    }

    public static void main(String[] args) {
//        System.out.println(dayOfTheWeek(31,8,2019));
//        System.out.println(dayOfTheWeek(18,7,1999));
//        System.out.println(dayOfTheWeek(15,8,1993));
//        System.out.println(dayOfTheWeek(1,1,1971));
        System.out.println(dayOfTheWeek(21,12,1980));
    }
}
