package java03.day05;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

    public static void main(String[] args) {

        // 기본 생성자를 이용하고 있는 date의 인스턴스를 만들어 보자.
        Date date = new Date(); // 기본생성자 생성

        // Date 인스턴스는 기본적으로 toString()가 오버라이드 되어 있어서 Date를 출력하면 똑같이 값이 나온다
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println(ft.format(date));
        System.out.println(date.getTime());
        long today = System.currentTimeMillis();
        System.out.println(today);

        System.out.println(today - date.getTime());

    }
}
