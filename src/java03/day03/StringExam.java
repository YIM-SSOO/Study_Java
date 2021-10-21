package java03.day03;

public class StringExam {

    public static void main(String[] args) {

        //String 클래스의 문제점 - String 클래스 : 불변 클래스 / 문자열

        String str1 = "hello world";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);


        // 비효율성
        String str5 = "";
        for (int i = 0; i < 100; i++) {
            str5 = str5 + '*';
        }
        System.out.println(str5);

        // StringBuffer를 활용하여 효율성을 높인다.
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);

    }
}
