package java01;

import java.util.Arrays;

public class ArrayToString {

    public static void main(String[] args) {

        // 배열을 통으로 출력하기


        //배열 선언
        String[] days = {"월", "화","수","목","금","토","일"};

        // 배열을 그대로 출력하면 주소 값이 출력됨.
        System.out.println(days);

        // Arrayts.toString()s을 이용하면 배열의 값이 그대로 출력하게됨.
        System.out.println(Arrays.toString(days));





    }
}
