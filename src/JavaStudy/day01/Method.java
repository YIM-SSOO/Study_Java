package JavaStudy.day01;

public class Method {
    public static void printDouble(int x){
        System.out.println(x * 2);
        return;
    }

    public static void main(String[] args) {
        int value = 2;
        printDouble(value);
        printDouble(3);

    }
}
