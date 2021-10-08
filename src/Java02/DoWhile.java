package Java02;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        // while 문의 경우, 조건이 만족되지 않는다면 한번도 수행되지 않는다.
        // 하지만 do-while 문의 경우, 무조건 한번은 실행되게 하는 구문이다.

        //반복했을 때 담을 수 있는 변수
        int value = 0;
        Scanner sc = new Scanner(System.in); // 어디론가부터 값을 입력 받고 싶을 때 사용하는 클래스(키보드로부터 - System.in)


        do {
            // 반복할 문장들을 이부분에 넣는다.
            // 무조건 do부터 시작하기때문에 이반복할 문장들이 한번은 실행된다.
            value = sc.nextInt(); // 정수 값을 입력받는다.
            System.out.println("입력받은 값은 : " + value); //입력받은 값을 출력

        } while (value != 10); // 조건 : value가 10이 아니라면 계속 수행하고 싶어요
        // 한번은 수행을 하고 while 문 안에 들어오면 while 문안에 적어준 조건이 만족할때만 다시 do까지 올라가서 수행한다.
        // 10이 아닌 숫자를 입력 받으면 계속 do를 실행
        // 10일 경우 종료

        System.out.println("반복문 종료");

    }
}
