
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        nachbarSpielerei();
        // orchesterSpielerei();
    }

//    private static void orchesterSpielerei() {
//        String audioDatei = "/All_Together.wav";
//        Orchester.Orchester orchester = new Orchester.Orchester("HSOS Test", audioDatei);
//
//        Orchester.DirigentIn dir = new Orchester.DirigentIn("Bester Man");
//        orchester.setDirigentIn(dir);
//        Orchester.MusikerIn sax = new Orchester.MusikerIn("Lange Lunge Larry", Orchester.Instrument.SAXOPHON);
//        Orchester.MusikerIn acc = new Orchester.MusikerIn("Tasten Tommy", Orchester.Instrument.AKKORDION);
//        Orchester.MusikerIn drum = new Orchester.MusikerIn("Drum Dominik", Orchester.Instrument.SCHLAGZEUG);
//        orchester.addMusiker(sax);
//        orchester.addMusiker(acc);
//        orchester.addMusiker(drum);
//
//        try {
//
//            orchester.proben();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

//    private static void test() throws IOException {
//        URL url = Main.class.getResource("/Accordion.wav");
//        Audio.SimpleAudioPlayerAdapter player = new Audio.SimpleAudioPlayerAdapter(url);
//        player.einmaligAbspielen(url);
//    }
    public static void nachbarSpielerei() {
        Nachbar n1 = new Nachbar("Peter", "Parker");
        Nachbar n2 = new Nachbar("Louise", "Lane");
        Nachbar n3 = new Nachbar("Peter", "Parker");
        Nachbar n4 = new Nachbar("Daniel", "Block");
        Nachbar n5 = new Nachbar("Andrea", "Schaab");
        Nachbar n6 = new Nachbar("Katja", "Spät");
        Nachbar n7 = new Nachbar("Vladimir", "Spät");
        Nachbar n8 = new Nachbar("Simon", "Gehling");
        Nachbar n9 = new Nachbar("Simon", "Gehling");

        Set<Nachbar> nachbarSet = new HashSet<>();
        nachbarSet.add(n1);
        nachbarSet.add(n2);
        nachbarSet.add(n3);
        nachbarSet.add(n4);
        nachbarSet.add(n5);
        nachbarSet.add(n6);
        nachbarSet.add(n7);
        nachbarSet.add(n8);
        nachbarSet.add(n9);
        nachbarSet.add(n5);

        System.out.print("Hallo! ");
        String out = nachbarSet.toString();
        out = out.substring(1, out.length() - 1);
        System.out.println(out + '.');
    }
}