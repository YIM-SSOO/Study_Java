package java01;

public class ThreadSleep {

    public static void main(String[] args) {

        //지연 시간 추가하기

        System.out.println("지금 무슨생각을 하고 있는지 맞춰 볼게요.");

        //지연시간을 추가하는 코드 =  Thread.sleep(1000)

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("치킨!!!");
    }
}
