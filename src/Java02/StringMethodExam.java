package Java02;

public class StringMethodExam {
    //String 클래스의 메소드

    public static void main(String[] args) {

        // 1. String 타입의 변수 str을 선언, 이 str이 hello라는 문자열을 가르키고 있다.
        // String str = new String("hello");
        String str = "hello";

        // 문자열길이를 구하는 length()
        System.out.println("str의 길이는 : "+ str.length());

        // 문자열과 문자열을 결합해주는 concat()
        // 여기서 주의해야할 점
        // contcat은 새로운 객체를 만들어 낸 것이다. str의 객체를 바꾸는 것이 아니다. String은 불변클래스
        System.out.println(str.concat(" world!")); // 새로운 객체가 생성
        str = str.concat(" world"); // 이렇게 해준다면 hello world로 바뀐다.
        System.out.println(str);

        // 원하는 부분까지만 문자열 자르기 (subString)
        // 5번 인덱스까지 잘라주세요 (hello world)
        System.out.println(str.substring(5));        // 출력결과 => world
        //  1번 인덱스부터 5번 인덱스 까지만를 잘라 출력
        System.out.println(str.substring(1, 5));     // 출력결과 => ello





    }


}
