import java.util.HashSet;

public class Release {
    String name;
    String url;
    ReleaseType type;
    HashSet<Artist> artists;
    HashSet<Song> songs;

    public Release(String name, String url, HashSet<Artist> artists, HashSet<Song> songs, ReleaseType type) {
        this.name = name;
        this.url = url;
        this.artists = artists;
        this.songs = songs;
        this.type = type;
    }
}
