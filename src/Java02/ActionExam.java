package Java02;

public class ActionExam {
    public static void main(String[] args) {

        // 1. 일반적인 형태
        // Action 타입의 Action을 하나 선언하고 반드시 Action은 추상클래스기 때문에 객체자체가 생성되지 않는다.
        // 그래서 생성은 MyAction이라고 하는 자식클래스가 생성되어야한다.
        // 이때 Action이 가지고 있는 메소드를 사용할수 있게 된다.
//        Action action = new MyAction();
//        action.exec();

        // 그런데 익명클래스는 자식클래스인 MyAction을 만들지 않고,
        // 이 ActionExam에서 Action을 상속받은 익명클래스를 만들어서 사용하도록 쓸 수 있다.

        //  Action action = new Action()는 추상클래스이기때문에 Action자체가 생성이 되지는 않는다.
        // 이랬을때 아래와 같이 익명으로 클래스가 하나 만들어지게 된다.

        Action action = new Action() {
            @Override
            public void exec() {
                // 똑같이 이 부분을 수행하는 메소드를 만들 수 있게된다.
                System.out.println("exec");

            }
        };
        // 이 때 사용하는 방법은  action.해당메소드 호출 ->  앞서 사용한 경우랑 똑같이 해당메소드를 사용할 수 있게된다.
        action.exec();

    }
}
// 이 생성자 다음에 나오는 중괄호 열고 닫고 이부분이 나오는데 해당 생성자 이름에 해당하는 클래스를 상속받은 이름없는 객체를 만든다는 것을 의미한다.
// 괄호안에는 메소드를 구현하거나 추가할 수 있다.
// 이렇게 생성된 이름없는 객체를 Action이라고 하는 참조변수가 참조하도록 하였다.
// 그리고 exec메소드를 호출했다.
// 익명클래스를 만드는 이유는 Action을 상속받는 클래스를 굳이 만들어 낼 필요가 없는 경우에 사용할 수 있다.
// Action을 상속받는 클래스가 해당 클래스 내에서만 사용이 되고 다른 클래스에서는 전혀 사용할 필요가 없는 경우가 있을 수 있다.
// 이랬을 때 사용할 수 있는 것이 익명클래스라고 한다.