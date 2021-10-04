package Java02;

public class MethodUse {

    public static void main(String[] args) {
        //메소드 사용
        /*
            메소드를 사용하기 위해서는 메소드가 정의된 클래스인 MethodExample이 생성되어야 한다
            객체를 생성할 때는 new 연산자를 이용한다.
            메소드 사용할때는 생성된 클래스를 참조하는 레퍼런스변수.메소드명() 으로 사용할 수 있다.
        */

        // 객체 생성
        MethodExample m = new MethodExample();

        //1번 실행
        m.method1();  // 출력 결과 -> m1이 실행됨

        //2번 실행
        m.method2(10); // 출력 결과 -> 10를 이용하는 method2() 입니다.

        //3번 실행
        /* 3번 메소드의 경우 리턴 값은 있으나 매개변수는 없다.
            int 값을 받아낼 변수가 필요
        */
        int value = m.method3(); //method 3 에서 리턴 받은 값을 담을 변수 value
        System.out.println("m3의 리턴 값은 : " + value + "입니다.");

        // 4번 실행
        /*
        * 매개 변수는 2개가 있지만 리턴값은 없다.
        * 이 메소드를 실행하기 위해서는 반드시 정수값 2개를 넣어주어야한다.
        * */
        m.method4(5, 10);

        //5번 실행
        /*
        *  매개변수가 있고, 리턴값이 있다
        *  매개변수 y의 값을 받아서 그다음에 또 리턴을 한다.
         */

        int value1 = m.method5(55);
        System.out.println("m5가 리턴한 값 : " + value1);


    }
}
