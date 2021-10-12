package Java02;

public interface TV {
    // 숫자를 고정시키고 싶을 때 상수를 활용
    // 상수는 final란 키워드가 없어도 상수처럼 사용이 가능하다.
    // 0-100까지의 볼륨조절
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();

    public void turnOff();

    public void changeVolume(int volume);

    public void changeChannel(int channel);
}
