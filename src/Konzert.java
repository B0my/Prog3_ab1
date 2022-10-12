import java.io.IOException;
import java.net.URL;

public class Konzert implements Verhalten {
    /**
     * @param orchester
     * @throws IOException
     * Spielt die Konzert Audiodatei ab
     */
    @Override
    public void spielen(Orchester orchester) throws IOException {

        URL url = Main.class.getResource("/All_Together.wav");
        StdAudioPlayer player = new SimpleAudioPlayerAdapter(url);
        player.einmaligAbspielen(url);
    }
}

