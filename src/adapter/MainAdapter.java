package adapter;

public class MainAdapter {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.reproducir("mp3", "beyond_the_horizon.mp3");
        audioPlayer.reproducir("mp4", "alone.mp4");
        audioPlayer.reproducir("vlc", "far_far_away.vlc");
        audioPlayer.reproducir("avi", "mind_me.avi");
    }
}
