import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;

public class Song implements Serializable {
    String name;
    String url;
    HashSet<Artist> artists = new HashSet<>();
    HashSet<Release> releases = new HashSet<>();

    public Song(String name, String url, Artist[] artists) {
        this.name = name;
        this.url = url;
        Collections.addAll(this.artists, artists);
    }

    public void addRelease(Release release) {
        this.releases.add(release);
    }

}
