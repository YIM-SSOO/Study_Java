package Java02;

public class MyCal implements Calculator {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int multiple(int a, int b) {
        return a * b;
    }
}
