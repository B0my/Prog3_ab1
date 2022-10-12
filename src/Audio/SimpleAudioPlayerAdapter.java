package Audio;

import de.hsos.prog3.audio.SimpleAudioPlayer;

import java.io.IOException;
import java.net.URL;

/**
 * AdapterKlasse
 */


public class SimpleAudioPlayerAdapter extends SimpleAudioPlayer implements StdAudioPlayer {

    /**
     * Ruft den Superkonstruktor auf um die Url weiterzugeben
     *
     * @param inputUrl
     * @throws IOException
     */
    public SimpleAudioPlayerAdapter(URL inputUrl) throws IOException {
        super(inputUrl);
    }

    /**
     * Mithilfe von @param wird der Ton mithilfe einer Hilfsfunktion tonAn() angeschaltet. Anschließend wird die funktion play(int x) ausgeführt welche den Ton abspielt.
     * Die 0 steht hier für 1x Abspielen
     * Zum Schluss wird der Ton wieder ausgeschaltet
     *
     * @param url
     * @throws IOException
     */
    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        tonAn();
        play(0);
        tonAus();
    }

    /**
     * Ähnliches verfahren wie in einmaligesAbspielen(URL), jedoch wird jetzt noch ein integer Wert übergeben um die Anzahl der wiederholungen von play(int) zu bestimmen
     *
     * @param url
     * @param wiederholungen
     * @throws IOException
     */
    @Override
    public void wiederholtAbspielen(URL url, int wiederholungen) throws IOException {
        tonAn();
        play(wiederholungen);
        tonAus();
    }

    /**
     * Benutzt die Methoden der Superklasse um den Ton anzuschalten
     */
    @Override
    public void tonAn() {
        setDebug(false);
        verboseLogging(true);
    }

    /**
     * Benutzt die Methoden der SUperklasse um den Ton auszuschalten
     */
    @Override
    public void tonAus() {
        setDebug(true);
        verboseLogging(true);
    }
}