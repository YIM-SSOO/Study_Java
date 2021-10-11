package Java02;

public class Bus1 extends Car5{

    public void run(){

        //부모의  run()메소드를 호출
        super.run();
        System.out.println("Bus1의 run메소드");
    }

}
