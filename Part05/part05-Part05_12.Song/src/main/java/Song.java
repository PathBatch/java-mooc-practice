
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals (Object otherSong) {
        if (this == otherSong) {
            return true;
        }
        if (!(otherSong instanceof Song)) {
            return false;
        }
        Song testSong = (Song) otherSong;
        if (this.artist.equals(testSong.artist) 
                && this.name.equals(testSong.name) 
                && this.durationInSeconds == testSong.durationInSeconds) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
