package Java02;

public class InnerExam {
    // 내부클래스
    // 필드를 선언하는 위치에 클래스를 선언하는 것이다.

    // 1. Cal이라는 클래스 선언
    class Cal {
        // 클래스를 선언하는 거니깐 똑같이 필드를 선언할 수도 있고
        // 메소드를 정의해 놓을 수도 있다.
        int value = 0;

        public void plus() {
            value++;
        }
    }


    public static void main(String[] args) {

        // 이렇게 내부에 존재하고 있는 Cal이라는 객체를 사용하기위해서는 어떻게해야할까?
        // 이럴땐 반드시 외부에있는 InnerClass -> InnerExam이라는 클래스가 먼저 만들어져야한다.
        // 혼자 독자적으로 생성될 수  없다.
        InnerExam t = new InnerExam();
        // 그리고 InnerExam이라는 클래스를 이용해서 new Cal()해야지만 해당 Cal()이라는 객체를 만들어 낼 수 있다.
        // t.new Cal();

        // 이 Cal()이라는 객체를 사용하기위해서는 또 변수가 선언되어야한다.
        // 타입이 선언되는 방법은 바깥쪽클래스타입.내부의타입으로 사용해야한다.
        // 변수를 선언하는 방법은 같다.
        InnerExam.Cal cal = t.new Cal();

        // 이제 사용하는 방법은 같다
        cal.plus();
        System.out.println(cal.value);

    }
}
