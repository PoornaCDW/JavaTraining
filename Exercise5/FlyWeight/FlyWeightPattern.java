package Exercise5.FlyWeight;

public class FlyWeightPattern {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playSong("ABCD", "ABCD Artist");
        musicPlayer.playSong("Life", "T. I.");
        musicPlayer.playSong("ABCD", "ABCD Artist");
        musicPlayer.playSong("Song", "T. I.");
    }
}