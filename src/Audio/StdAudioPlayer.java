package Audio;

import java.io.IOException;
import java.net.URL;
public interface StdAudioPlayer {


    /**
     * @param url Dateipfad der .wav Datei
     * @throws IOException
     */
    void einmaligAbspielen(URL url) throws IOException;

    /**
     * @param url
     * @param wiederholungen
     * @throws IOException
     */
    void wiederholtAbspielen(URL url, int wiederholungen) throws IOException;

    /**
     * Diese Funktion soll den Ton ausschalten
     */
    void tonAus();

    /**
     * Diese Funktion soll den Ton anschalten
     */
    void tonAn();
}
