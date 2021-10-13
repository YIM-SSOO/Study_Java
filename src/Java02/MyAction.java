package Java02;

// Action이라는 추상클래스를 상속받고 있는 MyAction 클래스
public class MyAction extends Action{
    // 그러면 반드시 추상클래스가 갖고있었던 메소드를 구현하도록 나올 것이다.
    @Override
    public void exec() {
        System.out.println("exec");
    }
    // 이게 구현하는 형태였다라고 기억.
}
