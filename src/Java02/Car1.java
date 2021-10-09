package Java02;

public class Car1 {

    // 생성자 오버로딩과 this
    // 생성자도 메소드와 마찬가지로 매개변수의 수와 타입이 다르다면 여러 개를 생성자를 선언할 수 있다.
    // 이를 생성자 오버로딩이라 한다.

    // 타입 필드명
    String name;
    int number;

    // 이 생성자는 이름만 초기값으로 받아들이고 있다.
    public Car1(String name) {
        this.name = name;
    }

    // 기본생성자
    // 아무것도 없이 생성자가 생성이 됐을 때
    public Car1() {
     /*   this.name = "이름없음";
        this.number = 0;*/
        // this는 자기자신을 가르킨다. this에 괄호 열고 괄호닫고하면 나의 생성자를 의미한다.
        this("이름없음", 0);
        // Car1에 default 생성자가 호출됐을 때,
        // 이 this부분 때문에 인자 2개 -->String 값과 int 값을 가진 생성자,
        // 아래에 있는 생성자가 호출이 된다.
        // (아래)이 생성자에 name에는 이름없음이 들어와서 필드네임에 이름없음,
        // number에는 0이 들어와서 필드에 넘버에는 0이라는 값을 초기화 시켜줄 수 있는 것을 보여줄 수 있다.
    }

    // Car1 객체가 처음 생성할 때부터 이름과 번호도 받아들이게 하고 싶을 때
    public Car1(String name, int number) {
        // 나의 필드 name에 지금 매개변수로 받아온 name의 값을 넣어주세요.
        this.name = name;
        // 나의 필드 number에 지금 매개변수로 받아온 number의 값을 넣어주세요.
        this.number = number;
    }
}
