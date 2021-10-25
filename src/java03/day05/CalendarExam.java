package java03.day05;

import java.util.Calendar;

public class CalendarExam {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // 자바는 0월부터 시작하기때문에 +1 해주어야 제대로 된 월의 정보를 알 수 있다.

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //24시 기준

        System.out.println(cal.get(Calendar.MINUTE));

        cal.add(Calendar.HOUR, 5);
        
    }
}
