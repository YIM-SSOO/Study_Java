package Java02;

//Car4를 상속받은 Truck 클래스
public class Truck extends Car4{
    // Truck의 생성자가 호출됐을 때 사실은 자동으로 컴파일러는 무얼 추가시켰냐면
    //  super(); 부모의 기본 생성자를 호출해주세요 이부분이 추가 됐을것이다.

    // 나를 가르키는 키워드가 this 였다면 부모를 가르키는 키워드는 super라는 것을 기억하자.


    //Truck이라는 클래스의 기본생성자
    public Truck(){

        super("트럭");
        System.out.println("Truck의 기본생성자입니다.");
    }

}
