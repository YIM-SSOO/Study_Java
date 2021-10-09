package Java02;

public class CarExam {

    public static void main(String[] args) {

        // Car c1 = new Car(); // new 옆에 있는 Car();가 생성자

        Car c2 = new Car("소방차");
        Car c3 = new Car("구급차");

        System.out.println(c2.name);
        System.out.println(c3.name);  // Car객체를 참조해서 생성
    }
}
