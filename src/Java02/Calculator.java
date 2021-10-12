package Java02;

public interface Calculator {
    public int plus(int a, int b);

    public int multiple(int a, int b);

    default int exec(int a, int b) {
        return a + b;
    }

    public static int exec2(int a, int b) {
        return a * b;
    }
}
