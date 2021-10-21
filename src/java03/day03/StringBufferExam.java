package java03.day03;

public class StringBufferExam {

    public static void main(String[] args) {
        //StringBuffer 생성
        StringBuffer sb = new StringBuffer();

        // StringBuffer에다 문자열을 하나씩 추가하기 = > append()
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        // 이렇게 추가된 StringBuffer객체는 toString() 가지고 있다.
        // 이 StringBuffer가 가진 toString()보면 리턴타입이 String이라는 것을 알 수 있다.

        String str = sb.toString();
        System.out.println(str);


        StringBuffer sb1 = new StringBuffer();
        //또다른 StringBuffer를 하나 선언을 하고, StringBuffer sb1이 가진 append()를 이용해서 문자열을 넣어본다
        StringBuffer sb2 = sb1.append("hello");

        // 이때 sb1과 sb2가 같은지 확인
        if (sb1 == sb2)
            System.out.println("sb1 == sb2");


        // StringBuffer를 생성했을때 끝나는게 아니라
        // 뒤에다가 . 하면 StringBuffer가 가진 메소드를 사용할 수 있다. 계속해서 사용가능

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);

    }
}
