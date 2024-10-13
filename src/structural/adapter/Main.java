package structural.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();//media Player support only MP3
        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
        player.play("avi", "not_supported.avi");
    }
}
