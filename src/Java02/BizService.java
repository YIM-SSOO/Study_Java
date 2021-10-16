package Java02;

public class BizService {

    // 비즈니스를 수행하는 Biz메소드를 정의
    // BizMethod는 int값을 받아들이고 exception이 발생했을 때 BizException을 throw 해주는
    public void bizMethod(int i) throws BizException {
        System.out.println("비즈니스 메소드 시작");

        //i가 0 보다 작을때
        if(i < 0)
            throw new BizException("매개변수 i는 0이상이어야 합니다.");

        System.out.println("비즈니스 메소드 종료");
    }
}
