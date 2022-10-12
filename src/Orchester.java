import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Orchester {
    /**
     * Konstruktor Für ein Objekt der Klasse Orchester. Dieses Objekt besitzt eine bezeichnung und den Pfad zur Konzert audio
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
    private Set<MusikerIn> musikerInnen = new HashSet<>();
    private final String bezeichnung;
    private final String audiodateiKonzert;

    /**
     * Setter Methode um den Dirigenten bei einem Konzert zu setzen
     * @param tmp
     */
    public void setDirigentIn(DirigentIn tmp) {
        this.dirigentIn = tmp;
    }

    /**
     * Fügt mithilfe des Hash Set einen neuen Musiker hinzu, der über @param übergeben wird
     * @param toAdd
     */
    public void addMusiker(MusikerIn toAdd) {
        this.musikerInnen.add(toAdd);
    }

    /**
     * Gibt das Set der Musiker zurück
     * @return
     */
    public Set<MusikerIn> getMusikerInnen() {
        return this.musikerInnen;
    }

    /**
     * Erstellt ein neues Probe Objekt mithilfe
     */
    void proben() throws IOException {
        verhalten = new Probe();

        try {
            verhalten.spielen(this);
        } catch (IOException e) {
            throw new IOException("Probe wird abgebrochen", e);

        }
    }

    void spielen() throws IOException {
        verhalten = new Konzert();

        try {
            verhalten.spielen(this);
        } catch (IOException e) {
            throw new IOException("Konzert wird abgebrochen", e);
        }
    }


}
