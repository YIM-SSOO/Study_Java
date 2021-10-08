package Java02;

public class Switch {

    public static void main(String[] args) {

        // switch문
        // 어떤 변수의 값에 따라서 문장을 실행할 수 있도록 하는 제어문
        // 사용하는 키워드 - switch, case, default, break
        // JDK ver.7 까지는 정수형만 가능
        // JDK ver.7 이상은 문자열도 가능하다.

        // 방법
        //1. 어떤케이스부터 시작해서 순차적으로 모두 실행시키고 싶을 때, 그럴때는 break 구문을 빼고 실행

        //2. 해당되는 케이스만 실행하고 싶을 때는
        //   break문을 통해서 switch문 바깥으로 나갈 수 있다.


        // 정수
        int value = 1;

        switch (value) {  // 만난케이스부터 나머지를 모두 출력한다.
            case 1: //case가 1이라면
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("그 외 다른 숫자");
        }

        // 문자
        String str = "A";
        switch (str) {
            case "A":
                System.out.println("A");

            case "B":
                System.out.println("B");

            case "C":
                System.out.println("C");

            default:
                System.out.println("그 외 문자");

        }
    }
}

