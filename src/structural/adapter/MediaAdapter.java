package structural.adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer mediaPlayer;
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MP4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            mediaPlayer = new VLCPlayer();
        }
    }
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer.playMP4(filename);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            mediaPlayer.playVLC(filename);
        }
    }
}
