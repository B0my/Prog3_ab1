package Orchester;
import Audio.SimpleAudioPlayerAdapter;
import Audio.StdAudioPlayer;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Orchester {
    /**
     * Konstruktor für ein Objekt der Klasse Orchester. Dieses Objekt besitzt eine bezeichnung und den Pfad zu der Orchester.Orchester.Konzert audio
     *
     * @param bezeichnung
     * @param audiodateiKonzert
     */
    public Orchester(String bezeichnung, String audiodateiKonzert) {
        this.bezeichnung = bezeichnung;
        this.audiodateiKonzert = audiodateiKonzert;
    }

    /**
     * Instanzvariabeln
     */
    private Verhalten verhalten;
    private DirigentIn dirigentIn;
    private final Set<MusikerIn> musikerInnen = new HashSet<>();
    private final String bezeichnung;
    private final String audiodateiKonzert;

    /**
     * Setter Methode um den Dirigenten bei einem Orchester.Orchester.Konzert zu setzen
     *
     * @param tmp
     */
    public void setDirigentIn(DirigentIn tmp) {
        this.dirigentIn = tmp;
    }

    /**
     * Fügt mithilfe des Hash Set einen neuen Musiker hinzu, der über @param übergeben wird
     *
     * @param toAdd
     */
    public void addMusiker(MusikerIn toAdd) {
        this.musikerInnen.add(toAdd);
    }

    /**
     * Gibt das Set der Musiker zurück
     *
     * @return
     */
    public Set<MusikerIn> getMusikerInnen() {
        return this.musikerInnen;
    }

    /**
     * Erstellt ein neues Orchester.Orchester.Probe Objekt mithilfe
     */
    void proben() throws IOException {
        verhalten = new Probe();
    }

    void auftreten() throws IOException {
        verhalten = new Konzert();
    }

    public void spielen() throws IOException {
        this.verhalten.spielen(this);
    }

    public class Probe implements Verhalten {

        /**
         * Iteriert mithilfe eines Set-Iterators durch das Set der Musiker und liest für alle Musiker in dem Set die URL heraus und spielt den Ton ab
         *
         * @param orchester
         * @throws IOException
         */
        @Override
        public void spielen(Orchester orchester) throws IOException {
            try {
                Iterator<MusikerIn> it = orchester.getMusikerInnen().iterator();
                while (it.hasNext()) {
                    URL url = Orchester.class.getResource(it.next().getInstument().getAudiodatei());
                    StdAudioPlayer player = new SimpleAudioPlayerAdapter(url);
                    player.einmaligAbspielen(url);
                }
            } catch (IOException e){
                throw new IOException("Probe wird abgebrochen", e);
            }
        }
    }

    public class Konzert implements Verhalten {
        /**
         * @param orchester
         * @throws IOException Spielt die Orchester.Orchester.Konzert Audiodatei ab
         */
        @Override
        public void spielen(Orchester orchester) throws IOException {
            try {
                URL url = Orchester.class.getResource("/All_Together.wav");
                StdAudioPlayer player = new SimpleAudioPlayerAdapter(url);
                player.einmaligAbspielen(url);
            } catch (IOException e) {
                throw new IOException("Auftritt wird abgebrochen", e);
            }
        }
    }
}