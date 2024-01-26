import java.io.Serializable;
import java.util.HashSet;

public abstract class Artist implements Serializable {
    protected String name;
    protected String url;
    protected HashSet<Song> songs = new HashSet<>();
    protected HashSet<Release> releases = new HashSet<>();

    public Artist(String name, String url) {
        if(name.isBlank() || url.isBlank()) throw new RuntimeException();
        this.name = name;
        this.url = url;
    }

    public void addSongs(HashSet<Song> songs) {
        this.songs.addAll(songs);
    }

    public void removeSongs(HashSet<Song> songs) {
        this.songs.removeAll(songs);
    }

    public void addRelease(Release release) {
        this.releases.add(release);
    }

    public void removeReleases(HashSet<Release> releases) {
        this.releases.removeAll(releases);
    }

}
