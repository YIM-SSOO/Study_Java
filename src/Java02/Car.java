package Java02;

public class Car {

    // 타입 필드명
    String name;
    int number;

    // 생성자 하는 만들어보자.
    // 생성자가 하는 역할 - 객체가 될 때 필드를 초기화하는 역할을 수행
   /* public Car(String name){ // 생성자의 매개변수가 name이라는 이름으로 정의하게 된다면 값을 제대로 사용할 수 가 없다
                                // 값을 출력 시 null
        name = name;
    }*/

    // 그래서 name이 누구인지 알려주어야하는데 그 때 사용할 수 있는 키워드가 this라는 키워드다.
    // 객체 자신을 참조하는 this 키워드 : 내 구성요소, 내꺼라는 의미를 가지고 있다.
    // - 클래스 안에서 자기자신이 가지고 있는 메서드를 사용하고 싶었을때에도 this라는 키워드를 사용해서 호출할 수 있다.
    // - 나의 생성자를 호출할 때에도 this라는 키워드를 이용해서 사용할 수 있다.
    public Car(String name) {
        this.name = name;
    }
}
