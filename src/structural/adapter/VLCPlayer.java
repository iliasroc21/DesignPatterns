package structural.adapter;

public class VLCPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMP4(String filename) {

    }

    @Override
    public void playVLC(String filename) {
        System.out.println("Playing VLC file. Name: " + filename);

    }
}
