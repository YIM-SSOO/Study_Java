package java03.day05;

public class ThreadExam {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("*");
        MyThread t2 = new MyThread("-");

        //Thread 동작시 run()가 아닌 start()를 호출한다.
        t1.start();
        t2.start();

        System.out.println("main end!!!");
    }
}
