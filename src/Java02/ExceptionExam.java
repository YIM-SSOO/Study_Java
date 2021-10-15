package Java02;

public class ExceptionExam {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            // e라는 레퍼런스 변수가 가리키고 있고 e라는 레퍼런스 변수는 toString()이라는 메소드를 가지고 있다.
            // 예외변수명.메소드명()
            // 예외의 정보를 알려주는 메소드
            System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
        } finally {
            System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
        }
        System.out.println("main End");
    }

}
