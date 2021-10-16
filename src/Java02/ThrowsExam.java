package Java02;

public class ThrowsExam {
    public static void main(String[] args) {

        // 정수에 값 넣기
        int i = 10;
        int j = 0;

        // 오류를 처리해야하는 부분
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (ArithmeticException e) {
            // 오류의 정보르 출력
            System.out.println(e.toString());
        }

    }

    // 정수 값 2개를 입력받고 그 정수를 나누어서 결과를 리턴하는 divide라는 메서드 정의
    public static int divide(int i, int j) throws ArithmeticException, ClassCastException {
        int k = i / j;
        return k;
    }
}
