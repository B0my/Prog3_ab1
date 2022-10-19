package Orchester;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Orchester {
    /**
     * Konstruktor für ein Objekt der Klasse Orchester. Dieses Objekt besitzt eine bezeichnung und den Pfad zu der Orchester.Konzert audio
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
     * Setter Methode um den Dirigenten bei einem Orchester.Konzert zu setzen
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
     * Erstellt ein neues Orchester.Probe Objekt mithilfe
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
}
