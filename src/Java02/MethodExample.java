package Java02;

public class MethodExample {

    // 메소드 선언 방법
    // public  리턴타입 메소드명(매개변수 등){ 구현 }

    //1. 리턴 타입이 없고, 매개변수가 없는 형태의 메소드
    public void method1() {
        System.out.println("m1이 실행됨");
    }

    //2. 정수를 매개변수로 받아들이고, 리턴타입이 없는 형태의 메소드
    public void method2(int x) {
        System.out.println(x + "를 이용하는 method2() 입니다.");
    }

    //3. 아무값도 받아들이지 않았지만, 뭔가를 수행해서 int 값을 돌려주는 형태의 메소드
    public int method3() {
        System.out.println("m3 실행");
        return 10;
        // 위 메소드가 실행되면, 콘솔에 'm3이 실행' 을 출력
        // 이 메소드를 호출한 쪽에 10을 리턴한다.
    }

    //4. 매개변수로 정수값을 2개 받고, 리턴 값이 없는 형태의 메소드
    public void method4(int x, int y) {
        System.out.println(x + y + " : m4 실행");

    }

    //5. 정수 y을 받아서 y를 반환해주는 형태의 메소드
    public int method5(int y) {
        System.out.println(y + "를 이용한 m5 실행");
        return y * 2;
    }

}



