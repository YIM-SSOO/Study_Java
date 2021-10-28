package java03.day05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeUtil {
    public static void main(String[] args) {


        // now() : 현재 시간을 구하는 메소드
        LocalDateTime timePoint = LocalDateTime.now(); // 현재의 날짜와 시간
        System.out.println(timePoint); //현재에 대한 정보를 가진 객체가 생성된 것을 확인할 수 있다.

        //원하는 시간으로 time객체 생성하는 방법
        // 2012년 12월 12일의 시간에 대한 정보를 가지는 LocalDate객체를 만드는 방법
        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12); // 2012-12-12 from values
        System.out.println(ld1); // ld1 객체 생성 확인

        // 17시 18분에 대한 LocalTime객체를 구한다.
        LocalTime lt1 = LocalTime.of(17, 18); // 17:18 (17시 18분)the train I took home today
        System.out.println(lt1); // 시간만 가진 객체 생성 확인

        // 10시 15분 30초라는 문자열에 대한 LocalTime객체를 구한다.
        //parse()
        LocalTime lt2 = LocalTime.parse("10:15:30"); // From a String
        System.out.println(lt2);

        //현재와 날짜와 시간정보를 getter메소드를 이용하여 구하는 방법
        LocalDate theDate = timePoint.toLocalDate(); // LocalDate : Date에 대한 정보를 확인
        System.out.println(theDate);
        System.out.println(timePoint.getDayOfMonth());


        Month month = timePoint.getMonth();
        int day = timePoint.getDayOfMonth();
        int hour = timePoint.getHour();
        int minute = timePoint.getMinute();
        int second = timePoint.getSecond();

        System.out.println(timePoint.getDayOfMonth());
        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());

        // 달을 숫자로 출력한다 1월도 1부터 시작하는 것을 알 수 있습니다.
        System.out.println(month.getValue() + "/" + day + "  " + hour + ":" + minute + ":" + second);
    }
}
