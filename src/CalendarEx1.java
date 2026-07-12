import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();

        System.out.println("년: " + c1.get(Calendar.YEAR));
        System.out.println("월: " + (c1.get(Calendar.MONTH)+1)); // 0이 1월
        System.out.println("올해의 몇 째 주: " + c1.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이달의 몇 째 주: " + c1.get(Calendar.WEEK_OF_MONTH));
        System.out.println("일: " + c1.get(Calendar.DATE));
        System.out.println("올해의 몇 일: " + c1.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1-7, 일요일이 1): " + c1.get(Calendar.DAY_OF_WEEK));
        System.out.println("이 달의 마지막 날: " + c1.getActualMaximum(Calendar.DATE));

        Calendar c2 = Calendar.getInstance();
        c2.set(2026, 6, 31);
        System.out.println("====================================");

        System.out.println(toString(c2));
        System.out.println("== add+1 ==");
        c2.add(Calendar.DATE, 1);
        System.out.println(toString(c2));
        System.out.println("== roll-1 ==");
        c2.roll(Calendar.DATE, -1);
        System.out.println(toString(c2));
        System.out.println("====================================");

        Date d =  c1.getTime();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));

    }

    public static String toString(Calendar c) {
        return c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH)+1) + "월 " + (c.get(Calendar.DATE)) + "일";
    }
}
