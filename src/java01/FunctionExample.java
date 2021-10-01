package java01;

public class FunctionExample {

    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Chicken");
        printSum(3, 5);
        int result = sum(3, 5);
        System.out.println(result);

        int[] sumAndProduct = addAndMultiply(2, 3);
        System.out.println("sum : " + sumAndProduct[0]);
        System.out.println("product : " + sumAndProduct[1]);

        sayHola("바보");

    }

    // 리턴 키워드
    public static void sayHola(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운말을 사용해주세요");
            return; //메소드의 실행을 끝내버림. 왜? 반환값이 없는 메서드이기 때문
        } else {
            System.out.println(name + "님, 안녕하세요?");
        }
    }


    // 정수형 배열을 반환값으로 설정, 두 정수를 더한 값과 곱한 값은 반환
    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};

        return result;
    }


    // 두 정수 a와 b를 인자로 받는 sum()
    public static int sum(int a, int b) {
        return a + b;
    }

    // 두 수의 합을 출력하는 메서드
    public static void printSum(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
    }


    //입력값이 존재하는 메서드
    public static void sayHelloTo(String name) {
        System.out.println("Hello" + name);
    }


    public static void sayHello() {
        System.out.println("Hello!");
    }
}
