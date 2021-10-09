package Java02;

public class CarExam01 {

    public static void main(String[] args) {

        // 기본 생성자
         Car1 c1 = new Car1(); // new 옆에 있는 Car();가 생성자

        // this를 사용한 생성자 - 생성자 중에 name을 받아들이는 생성자만 있었음
        Car1 c2 = new Car1("소방차");
        Car1 c3 = new Car1("구급차");

        //System.out.println(c2.name);
        //System.out.println(c3.name);  // Car객체를 참조해서 생성

        // 두개의 인자를 받아들이는 생성자를 이용해 Car1()객체를 만들어보자
        Car1 c4 = new Car1("구급차", 1234);

    }
}
