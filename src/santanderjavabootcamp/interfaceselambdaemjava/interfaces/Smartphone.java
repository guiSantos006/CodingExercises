package santanderjavabootcamp.interfaceselambdaemjava.interfaces;

public class Smartphone implements VideoPlayer, MusicPlayer {


    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone parou a música");

    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone está reproduzindo o vídeo");

    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone pausou o vídeo");

    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone parou o vídeo");

    }
}
