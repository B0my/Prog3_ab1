import de.hsos.prog3.audio.SimpleAudioPlayer;
// import java.IOException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.net.URL;
public interface StdAudioPlayer {


    /**
     *
     * @param url
     * @throws IOException
     *
     *
     */
    void einmaligAbspielen(URL url) throws IOException;

    /**
     *
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
