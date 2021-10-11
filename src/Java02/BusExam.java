package Java02;

public class BusExam {

    // Car3을 상속 받은 Bus 사용

    public static void main(String[] args) {
         Bus bus = new Bus();

         bus.run();
         // 부모가 가진 메소드 외에도 추가로 메소드를 추가하는 것을 확장하였다라한다.
         bus.ppangppang();
         
         Car3 car = new Car3();
         car.run();
         // car.ppangppang(); // 에러 - 자식이 가지고 있는 메소드는 실행시킬 수 없다.
    }
}
