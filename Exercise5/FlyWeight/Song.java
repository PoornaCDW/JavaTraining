package Exercise5.FlyWeight;

class Song{
    private String songName;
    private String songArtist;
    

    public Song(String songName, String songArtist) {
        this.songName = songName;
        this.songArtist = songArtist;
    }
    
    public void play() {
        System.out.println("Playing Song: "+songName+" by artisy - "+songArtist);
    }
}