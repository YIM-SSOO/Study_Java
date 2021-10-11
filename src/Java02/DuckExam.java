package Java02;

public class DuckExam {
    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.sing();
        duck.fly(); //Duck에서 Bird를 상속 받았기때문에 구현하지 않았지만 fly()를 사용할 수 있다.

        //Bird b = new Bird();
        // --오류-- : 실제 버드라고 하는 클래스는 추상클래스는 부모로서의 역할은 가능하지만 추상클래스를 이용해서 객체를 생성할 수 없다.

    }
}
