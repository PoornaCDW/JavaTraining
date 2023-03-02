package Exercise5.FlyWeight;

import java.util.HashMap;
import java.util.Map;

class MusicPlayer implements MusicPlayerInterface {
    private Map<String, Song> songs = new HashMap<>();

    @Override
    public void playSong(String songName, String songArtist) {
        Song song = songs.get(songArtist);

        if(song == null) {
            song = new Song(songName, songArtist);
            songs.put(songArtist, song);
        }

        song.play();
    }
}