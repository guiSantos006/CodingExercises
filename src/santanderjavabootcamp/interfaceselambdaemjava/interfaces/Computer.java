package santanderjavabootcamp.interfaceselambdaemjava.interfaces;

public class Computer implements VideoPlayer, MusicPlayer {


    @Override
    public void playMusic() {
        System.out.println("O computador está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador parou a música");

    }

    @Override
    public void playVideo() {
        System.out.println("O computador está reproduzindo o vídeo");

    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador pausou o vídeo");

    }

    @Override
    public void stopVideo() {
        System.out.println("O computador parou o vídeo");

    }
}
