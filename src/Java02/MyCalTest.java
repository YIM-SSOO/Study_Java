package Java02;

public class MyCalTest {
    public static void main(String[] args) {

        Calculator cal = new MyCal();

        cal.plus(5,6);
        cal.multiple(5,6);
        int i = cal.exec(5, 6);
        System.out.println(i);

        // cal.exec2(); --> 에러
        Calculator.exec2(3,4);
    }
}
