import java.util.HashSet;

public class Artist {
    String name;
    String url;
    HashSet<Song> songs = new HashSet<>();
    HashSet<Release> releases = new HashSet<>();

    public Artist(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void addSongs(HashSet<Song> songs) {
        this.songs.addAll(songs);
    }
}
