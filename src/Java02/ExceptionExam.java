package Java02;

public class ExceptionExam {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
        } finally {
            System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
        }
    }

}
