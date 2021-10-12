package Java02;


// class LedTV를 정의하는데 이 LedTV는 인터페이스 TV를 구현하겠다라는 의미
// 이 의미는 TV가 가진 기능들을 LEDTV도 갖게하겠다라는 의미와 같다.
public class LedTV implements TV {


    @Override
    public void turnOn() {
        System.out.println("켜다.");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다.");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 조절하다.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널을 변경하다.");
    }
}
