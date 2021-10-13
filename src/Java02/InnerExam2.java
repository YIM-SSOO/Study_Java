package Java02;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class InnerExam2 {
    // 지역중첩클래스 이름에서 느껴지듯이
    // 이 내부 클래스가 인스턴스변수로 선언되는 것이 아니라
    // 메소드안에서 선언되는 경우를 말한다.
    public void exec() {
        // 메소드를 정의하고 이 메소드안에 Cal이라는 클래스가 생성되어 있는 경우
        class Cal {
            // 클래스를 선언하는 거니깐 똑같이 필드를 선언할 수도 있고
            // 메소드를 정의해 놓을 수도 있다.
            int value = 0;

            public void plus() {
                value++;
            }
        }
        // 이랬을때 이 Cal이라는 객체를 생성해서 사용할 수 있는 부분은
        // 메소드안에서만 사용할 수 있다.
        // 메소드안에서 Cal이라는 객체를 생성할 수 있을 것이고, 메소드안에서 Cal이라는 객체가 가진 메소드를 호출한다던가  Cal가지고 있는 value를 호출해서 사용할 수 있다.
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        //이것을 사용하기 위해서는 InnerExam2 객체를 생성
        InnerExam2 t = new InnerExam2();
        // InnerExam2가 가지고 있는 메소드를 호출할 때 내부적으로 Cal()이라는 클래스가 하나 생성이 되고 Cal이라는 클래스가 정의되어있는 부분이 수행되는 것을 알 수 있다.
        // 이렇게 메소드안에서도 클래스를 지역변수처럼 선언해서 사용할 수 있다.
        t.exec();

    }
}
