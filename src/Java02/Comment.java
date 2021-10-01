package Java02;

public class Comment {

    public static void main(String[] args) {

        // 서식 문자
        System.out.printf("오늘의 기온은 10도입니다. ");

        // 10진수
        //System.out.printf("오늘의 기온은 %d도 입니다.");


        // 정수
        int num = 30;

        // 1. 10진수
        System.out.printf("num(10진수) : %d\n", num );
        // 2. 8진수
        System.out.printf("num(6진수) : %o\n", num );
        // 3. 16진수
        System.out.printf("num(16진수) : %x\n", num );


        // 문자열
        Character b = 'b';
        Character B = 'B';

        // 1. 문자
        System.out.printf(" 소문자 \'%c\'의  대문자는 \'%c\' 입니다.\n ", b, B );
    }
}
