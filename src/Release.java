import java.util.HashSet;

public class Release {
    String name;
    String url;
    HashSet<Artist> artists;
    HashSet<Song> songs;
    ReleaseType type;

    public Release(String name, String url, HashSet<Artist> artists, HashSet<Song> songs, ReleaseType type) {
        this.name = name;
        this.url = url;
        this.artists = artists;
        this.songs = songs;
        this.type = type;
    }
}
