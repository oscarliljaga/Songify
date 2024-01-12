import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    }

}

/**
 * Upphovsperson, Soloartist, Grupp, Release, LP, EP, Singel, Samling, Låt
 *
 * Soloartist ärver från Upphovsperson som innehåller Release/Låt. Grupp innehåller Soloartist.
 * LP, EP, Singel, Samling ärver från Release som innehåller Låt och Artist, som båda innehåller Release och varann.
 */