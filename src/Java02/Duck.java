package Java02;

public class Duck extends Bird{


    // Bird가 갖고 있었던 추상메소드인 sing()가 구현이되어야하기때문에  오버라이드해주어야한다.
    @Override
    public void sing() {
        System.out.println("꽥꽥!!");
    }
}
