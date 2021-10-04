package Java02;

public class ScopeStatic {

    //변수의 스코프
    //프로그램상에서 사용되는 변수들은 사용 가능한 범위를 가진다. 그 범위를 변수의 스코프라고 한다.

    int globalScope = 10;

    // static한 필드(필드 앞에 static 키워드를 붙힘)나,
    // static한 메소드는 Class가 인스턴스화 되지 않아도 사용할 수 있다.
    static int staticVal = 7;


    public void ScopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value) {
        System.out.println(globalScope);
        //System.out.println(localScope);  //  컴파일 에러 - 변수를 선언한 블록에 포함되어 있지 않기 때문
        System.out.println(value);
    }

    public static void main(String[] args) {

        //System.out.println(globalScope); //에러
        //System.out.println(localScope);  //에러
        //System.out.println(value);       //에러

        System.out.println(staticVal); // 사용가능
    }


}
