package java03.day01;

public class WrapperExam {

    public static void main(String[] args) {

        // int i는 기본형 타입
        int i = 5;

        //integer 객체 선언 ==> integer i2 는  실제  int를 객체로 바꿔주는 wrapper클래스 중에 하나인 Integer 클래스다.
        Integer i2 = new Integer(5);


        Integer i3 = 5;     //오토박싱

        // 마찬가지로 꺼내올때도
        // Integer 타입 i3에 들어있는 값을 int타입으로 바꾸고 싶다면
        // 반드시 intValue()같은 메소드를 이용해야지만 객체로 감싸져있는것을 한번 벗겨내고
        // int타입으로 사용할 수 있었다.

        // 그런데 자바 5이후부터는  intValue()라는 메소드를 호출하지않아도 바로 꺼내서 사용할 수 있다.
        // 이러한 것을 오토언박싱이라 한다.
        // 오토언박싱: 오토박싱과 반대로 객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환
        int i4 = i3.intValue();
        int i5 = i3;       //오토언박싱
    }
}

