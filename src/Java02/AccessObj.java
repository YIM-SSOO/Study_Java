package Java02;

public class AccessObj {

    // 접근제한자
    // 1. public - 어떤 클래스든 접근할 수 있다.
    // 2. protected - 접근 제한자

    // 공개범위 : public >  protected > default > private
    public int p = 3 ;      // 전제공개
    protected int p2 = 4;   // 모두 X, 패키지가 같다면 공개, 그렇지만 다른패키지에 있다하더라도 상속받은  자식 클래스한테는 접근할 수 있게해준다.
    int k =2;               // default 지정자를 가졌다 : 자기자신과 같은 패키지에서만 접근할 수 있다.
    private  int i = 1;     // 자기자신만 접근할 수 있다.


}
