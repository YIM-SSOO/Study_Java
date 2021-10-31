package java03.day05;

public class MusicPlayer extends Thread {

    int type;
    MusicBox m = new MusicBox();

    public MusicPlayer(int type, MusicBox m) {
        this.type = type;
        this.m = m;
    }

    @Override
    public void run() {
        switch (type) {
            case 1:
                m.playMusicA();
                break;
            case 2:
                m.playMusicB();
                break;
            case 3:
                m.playMusicC();
                break;
        }

    }
}
