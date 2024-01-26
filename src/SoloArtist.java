import java.util.HashSet;

public class SoloArtist extends Artist{
    HashSet<Group> groups;
    public SoloArtist(String name, String url) {
        super(name, url);
    }
}
