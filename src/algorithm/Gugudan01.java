package algorithm;

import java.util.Scanner;

public class Gugudan01 {
    public static void main(String[] args) {


        // 1.System.out.println()을 활용해 화면에 출력

        //2단
       /* System.out.println("2단");
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);
        System.out.println(2 * 8);
        System.out.println(2 * 9);
        System.out.println(2 * 10);*/

        // 3단
        /*System.out.println("3단");
        System.out.println(3 * 1);
        System.out.println(3 * 2);
        System.out.println(3 * 3);
        System.out.println(3 * 4);
        System.out.println(3 * 5);
        System.out.println(3 * 6);
        System.out.println(3 * 7);
        System.out.println(3 * 8);
        System.out.println(3 * 9);
        System.out.println(3 * 10);*/


        // 2. 구구단에서 4단과 5단을 계산한 결과 값을 변수에 저장한 후 저장한 변수 값을 출력


        //4단
//        System.out.println("4단");
//        int result = 4 * 1;
//        System.out.println(result);
//
//        result = 4 * 2;
//        System.out.println(result);
//
//        result = 4 * 3;
//        System.out.println(result);
//
//        result = 4 * 4;
//        System.out.println(result);
//
//        result = 4 * 5;
//        System.out.println(result);
//
//        result = 4 * 6;
//        System.out.println(result);
//
//        result = 4 * 7;
//        System.out.println(result);
//
//        result = 4 * 8;
//        System.out.println(result);
//
//        result = 4 * 8 - 9;
//        System.out.println(result);
//
//        result = 4 * 10;
//        System.out.println(result);

        // 5단

        /*System.out.println("구구단을 출력할 단은?");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num * 1);
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(num * 4);
        System.out.println(num * 5);
        System.out.println(num * 6);
        System.out.println(num * 7);
        System.out.println(num * 8);
        System.out.println(num * 9);*/


        // 3. 단순, 반복적인 작업을 변수와 반복문을 활용해 제거하면서 6단과 7단을 구현

        //6단 (while문)
        // int i = 1; // 시작점

        //whlie이 언제까지 이부분을 반복할 것인가
        // i가 10보다 작은동안 실행
        //while (i < 10) {

        //곱셈 결과를 출력
        //6단 실행
        //     System.out.println(6 * i);
        // 출력해주고 i + 1
        //     i = ++i;
        //}

        //7단 (for문 사용)
        /*for (int j = 1; j < 10; j++) {
            System.out.println(7 * j);
        }*/


        // 값 입력 및 조건문
        /*요구사항
            사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
            예를 들어 사용자가 8이라는 숫자를 입력하면 8단 전체를 계산해 출력한다.
            사용자가 2 이상, 9 이하가 아닌 값을 입력하는 경우 "2이상, 9이하의 값만 입력할 수 있습니다.
            "라는 메시지를 출력한다.
            */


        // 8단, 9단 입력받아 출력

        System.out.println("출력할 단을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("사용자가 입력한 숫자는 :" + num + "입니다.");

        //조건 - 2이상, 9이하가 아닌 값을 입력했을 경우
        // if 입력값이 2보다 작을때
        if (num < 2) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        // if 입력값이 9보다 큰 경우
        } else if (num > 9) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else {
            for (int i = 1; i < 10; i++) {
                System.out.println(num * i);
            }
        }
        sc.close();
    }


    // Scanner sc = new Scanner(System.in);
    //System.out.println("진행할 구구단 숫자를 입력해주세요.");
    //int a = sc.nextInt();
    //for (int i = 1; i < 10; i++) {
    //    System.out.println("현재 i의 값은  :" + i);  //현재 i의 값
    //    int result = i * a;       //result의 값
    //    System.out.println(a +"*"+ i + " = " + result);  // 출력 입력한 값 * i = result
    //}


}
