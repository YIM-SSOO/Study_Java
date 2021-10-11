package Java02;

//  추상클래스
public abstract class Bird {

    // 추상클래스를 정의하는 방법
    public abstract void sing(); //나는 추상메소드예요. public abstract~

    // 추상클래스에서 추상메소드 외에도 일반 메소드도 구현가능.
    public void fly() {
        System.out.println("날다");
    }

}
