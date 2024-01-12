import java.util.HashSet;

public class Group extends Artist{
    HashSet<SoloArtist> members = new HashSet<>();

    public Group(String name, String url) {
        super(name, url);
    }

    public void addMembers(HashSet<SoloArtist> members) {
        this.members.addAll(members);
    }

    public void removeMembers(HashSet<SoloArtist> members) {
        this.members.removeAll(members);
    }
}
