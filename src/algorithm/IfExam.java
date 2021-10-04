package algorithm;

import java.util.Scanner;

public class IfExam {

    //윤년

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();


        /*
        * 조건을 보면 4의 배수는 윤년으로 1을 출력하지만 100의 배수일 경우 윤년이 아니라 0을 출력해야한다.

          다만, 400의 배수일 경우는 윤년으로 본다.

          기본 알고리즘은 먼저 4의 배수인지 여부를 본 뒤 4의 배수일 경우 400으로 나뉘어 떨어지는지,
          100으로 나뉘어 떨어지는지 여부를 검사한다.
          즉 1-1 단계 : 4의 배수일 경우 - if ( year%4==0 )

          2-1 단계 : 4의 배수이면서 400의 배수일 경우 - if ( year%400 == 0 )

          2-2 단계 : 4의 배수이면서 100의 배수일 경우 - else if ( year%100 == 0 )

          2-3 단계 : 2단계 조건식 나머지 - else

          1-2 단계 : 1 단계 조건식 나머지 - else
          이러한 구조로 본다.
            */
        if(year % 4 == 0){

            if(year % 400 == 0) {
                System.out.println("1");
            }else if(year % 100 == 0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else {
            System.out.println("0");
        }
    }
}
