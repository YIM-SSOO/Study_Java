package java03.day05;

public class MusicBoxExam {

    public static void main(String[] args) {

        MusicBox box = new MusicBox();

        MusicPlayer i = new MusicPlayer(1, box);
        MusicPlayer k = new MusicPlayer(2, box);
        MusicPlayer l = new MusicPlayer(3, box);

        i.start();
        k.start();
        l.start();

    }
}
