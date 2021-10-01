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


        // 문자
        Character b = 'b';
        Character B = 'B';

        System.out.printf(" 소문자 \'%c\'의  대문자는 \'%c\' 입니다.\n ", b, B );

        // 문자열
        String d = "d";
        String D = "D";

        System.out.printf("\'%s\'을 대문자로 바꾸면 \'%s\' 입니다.", d, D);

        // 실수
        float num2 = 1.9f;
        System.out.printf("num2 = %f\n", num2);
        double num3 = 2.099d;
        System.out.printf("num3 = %f\n", num3);


    }
}
