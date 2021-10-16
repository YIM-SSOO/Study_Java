package Java02;

public class ExceptionThrowExam {

    public static void main(String[] args) {

        // 정수에 값 넣기
        int i = 10;
        int j = 0;

        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }

    }

    // 정수 값 2개를 입력받고 그 정수를 나누어서 결과를 리턴하는 divide라는 메서드 정의
    public static int divide(int i, int j) throws IllegalArgumentException {

        if (j == 0) {
            //new 앞에 throw라는 키워드가 있다면
            // 해당 라인에서 Exception이 발생한다라는 뜻.
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");

        }
        int k = i / j;
        return k;
    }
}
