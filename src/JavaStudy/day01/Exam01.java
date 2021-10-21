package JavaStudy.day01;

import java.util.Scanner;

public class Exam01 {

    public static int getRandomInt() {
        //아래 코드는 1~100의 무작위 정수를 구하는 코드입니다.
        int randInt = (int) (Math.random() * 100) + 1;
        return randInt;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //난수를 출력할 횟수를 입력하세요..

        /* 반복문을 이용해 getRandomInt 함수의 반환값을 출력해보세요!
           n줄에 걸쳐 1 이상 100 이하의 무작위 정수가 출력됩니다.
          */

        for (int i = 0; i < n; i++) {
            //지시사항 1번을 참고하여 코드를 작성하세요.
            System.out.println(getRandomInt());
        }

    }
}
