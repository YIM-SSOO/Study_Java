package Java02;


// 삼항 연산자
public class Operator {
    public static void main(String[] args) {


        // 1. 먼저 괄호에 있는걸 먼저 수행 => 두개의 값을 비교 5가 4보다 큽니까? 그래서 뒤에 물음표가 붙는다.
        // 2. 만약에 5가 더 큰게 맞다면(true) 50이라는 값을, 다르다면(false) 40이라는 값을 b1에 담아주세요.

        int b1 = (5 > 4) ? 50 : 40;

        System.out.println(b1);    // 출력 결과 : 50


        // 삼항 연산자는 if문과 같다.
        // if문
        int b2 = 0;
        if (5 > 4) {
            b2 = 50;
        } else {
            b2 = 40;
        }
        System.out.println(b2);
    }

}
