public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/**
 * Upphovsperson, Soloartist, Grupp, Release, LP, EP, Singel, Samling, Låt
 *
 * Soloartist ärver från Upphovsperson som innehåller Release/Låt. Grupp innehåller Soloartist.
 * LP, EP, Singel, Samling ärver från Release som innehåller Låt och Artist, som båda innehåller Release och varann.
 */