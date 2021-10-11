package Java02;

public class BusExam02 {

    public static void main(String[] args) {

        Car6 c = new Bus2();
        c.run();
       // c.ppangppang(); // 컴파일에러

        // 자식의 메소드를 사용하고 싶다면
        // 그랬을때 쓰는 것이 형변환이다.

        Bus2 bus = (Bus2)c;  //부모타입을 자식타입으로 형변환
        bus.run();
        bus.ppangppang();
    }
}
