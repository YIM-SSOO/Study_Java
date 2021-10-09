package Java02;

public class MethodOverloadExam {
    // 오버로딩된 메소드 이용하기

    public static void main(String[] args) {


        // 해당 클래스가 만들어져 있어야하고
        // 클래스타입 변수명 = new 클래스가 가지고 있는 생성자이름();
        MyClass2 m = new MyClass2();

        // 1. 정수형 매개변수 2개를 더하여 리턴하는 메서드
        System.out.println(m.plus(5, 5)); // 매개변수.갖고있는 메서드

        // 2. 정수형 매개변수 3개를 더하여 리턴하는 메서드
        System.out.println(m.plus(5, 6, 7));

        // 3. 문자열 결합하여 리턴하는 메서드
        System.out.println(m.plus("a", "b"));
    }

}
