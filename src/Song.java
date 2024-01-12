import java.util.HashSet;

public class Song {
    String name;
    String url;
    HashSet<Artist> artists = new HashSet<>();
    HashSet<Release> releases = new HashSet<>();

    public Song(String name, String url, HashSet<Artist> artists) {
        this.name = name;
        this.url = url;
        this.artists = artists;
    }

    public void addReleases(HashSet<Release> releases)
    {
        this.releases.addAll(releases);
    }
}
