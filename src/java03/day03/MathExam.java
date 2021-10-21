package java03.day03;

public class MathExam {

    public static void main(String[] args) {

        //최대값 구하기
        // Static한 메소드 선언 - 클래스명.메소드명
        // max() : 두 값중에 더 큰 값을 구할 수 있는 메소드
        int value1 = Math.max(5, 30);
        System.out.println(value1);


        // 최소값 구하기
        int value = Math.min(5,30);
        System.out.println(value);

        // 절대값 구하기 - abs()
        System.out.println(Math.abs(-10));

        // 랜덤한 값 구하기 - random()는 double타입이다. 0이상 1.0 미만의 실수 값을 구한다.
        System.out.println(Math.random());

        // 제곱근을 구하기 - sqrt()
        System.out.println(Math.sqrt(25));
    }
}
