package java03.day05;

public class LamdaExam {
    public static void main(String[] args) {
        // Thread 생성 Runnable 인터페이스
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hello");
                }
            }
        }).start();*/

        // 람다식
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
        }).start();
    }
}
