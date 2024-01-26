import java.io.Serializable;
import java.util.HashSet;

public class Release implements Serializable {
    String name;
    String url;
    ReleaseType type;
    HashSet<Artist> artists;
    HashSet<Song> songs;

    public Release(String name, String url, Artist[] artists, Song[] songs, ReleaseType type) {
        this.name = name;
        this.url = url;
        this.type = type;

        for (Artist artist : artists) {
            this.artists.add(artist);
            artist.addRelease(this);
        }

        for (Song song : songs) {
            this.songs.add(song);
            song.addRelease(this);
        }

    }
}
