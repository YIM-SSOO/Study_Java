package Java02;

public class BizException extends RuntimeException {

    // Exception 객체에서는 생성자만 지정해주면 된다.

    // 1. 어떤 오류가 발생했는지 String값으로 메세지를 가지고 들여오는 생성자
    // (문자열로 된 오류 메세지)
    public BizException(String msg) {
        super(msg);
    }

    // 2. Exception을 받아들여서 해당 Exception을 부모의 생성자에게 넘겨줄 수 있는 생성자
    // (실제 발생할 Exception을 담는 목적의 생성자)
    public BizException(Exception ex) {
        super(ex);
    }
}
