package Exercise5.FlyWeight;

import java.util.HashMap;
import java.util.Map;

class MusicPlayer implements MusicPlayerInterface {
    private Map<String, Song[]> songs = new HashMap<>();

    public void playSong(String songName, String songArtist) {
        Song[] artistSongs = songs.get(songArtist);

        if(artistSongs == null) {
            artistSongs = new Song[5];
            songs.put(songArtist, artistSongs);
        }

        Song song = getSongByName(songName, artistSongs);

        if(song == null) {
            song = new Song(songName, songArtist);
            addSongToArray(song, artistSongs);
        }

        song.play();
    }

    private Song getSongByName(String songName, Song[] artistSongs) {
        for(Song song : artistSongs) {
            if(song != null && song.getSongName().equals(songName)) {
                return song;
            }
        }
        return null;
    }

    private void addSongToArray(Song song, Song[] artistSongs) {
        for(int i = 0; i < artistSongs.length; i++) {
            if(artistSongs[i] == null) {
                artistSongs[i] = song;
                return;
            }
        }
    }
}