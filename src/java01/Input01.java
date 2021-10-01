package java01;

import java.util.Scanner;

public class Input01 {

    public static void main(String[] args) {

        // 1. Scanner
        //Scanner scanner;

        // System.in == 표준 입력 인터페이스
        //scanner = new Scanner(System.in);

        //문자열 타입 반환
        //String input = scanner.nextLine();
        //System.out.println(input);


        // 2. next()
        //next() : 띄어쓰기 단위로 문자를 분할해서 되돌려주는 기능
        //

       /* System.out.println("영어 단어와 한글 단어를 하나씩 입력해보세요");
        Scanner scanner = new Scanner(System.in);

        String englishWord = scanner.next();
        String koreanWord = scanner.next();

        System.out.println("입력된 영단어 : " + englishWord);
        System.out.println("입력된 한글 단어 : " + koreanWord);*/



        // 3. 문자열 타입을 숫자로 변환
        System.out.println("숫자를 하나 입력해주세요.");
        Scanner scanner = new Scanner(System.in);

        //문자열로 받은 숫자
        String intInput = scanner.nextLine();

        // Integer.parseInt()에 입력받은 문자열을 파라미터로 넘겨준다.
        int intValue = Integer.parseInt(intInput);

        //출력 ==> 문자열 ==> 100 ==> 숫자변환 ===> 101  출력
        System.out.println(intValue + 1);


    }


}
