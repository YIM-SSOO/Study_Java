package java03.day05;

public class MusicBox {
    // 쓰레드와 공유객체

    public void playMusicA() {
        for (int i = 0; i < 10; i++) {
            System.out.println("신나는 출력");

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicB() {
        for (int i = 0; i < 10; i++) {
            System.out.println("슬픈노래 출력");

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicC() {
        for (int i = 0; i < 10; i++) {
            System.out.println("카페음악 출력");

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
