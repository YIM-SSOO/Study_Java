package java03.day05;

public class CompareExam {

    public static void exec(Compare compara) {
        int k = 10;
        int m = 20;
        int value = compara.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        exec((i, j) -> {
            return i - j;
        });
    }

}
