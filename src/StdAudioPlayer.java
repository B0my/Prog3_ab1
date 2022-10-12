import de.hsos.prog3.audio.SimpleAudioPlayer;
// import java.IOException;
import java.util.HashSet;
import java.util.Set;
import java.net.URL;
public interface StdAudioPlayer {
    
    void einmaligAbspielen(URL url);
    void wiederholtAbspielen(URL url, int wiederholungen);
    void tonAus();
    void tonAn();
}
