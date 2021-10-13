package Java02;

public abstract class Action {
    // 이 Action이라는 클래스가 추상메소드인 exec이라는 메소드를 가지고 있었을 때
    // 이런 추상클래스를 사용하기 위해서는 반드시 이클래스를 상속받은 자식클래스가 해당메소드를 구현해야지만 된다 했었다.
    // 자 그렇게 Action을 상속받고 있는 MyAction이라는 클래스를 작성해보겠다.

    public abstract void exec();
}
