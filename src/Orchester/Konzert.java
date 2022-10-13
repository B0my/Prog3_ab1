package Orchester;

import Audio.SimpleAudioPlayerAdapter;
import Audio.StdAudioPlayer;
import com.sun.tools.javac.Main;

import java.io.IOException;
import java.net.URL;

public class Konzert implements Verhalten {
    /**
     * @param orchester
     * @throws IOException Spielt die Orchester.Konzert Audiodatei ab
     */
    @Override
    public void spielen(Orchester orchester) throws IOException {
        URL url = Orchester.class.getResource("/All_Together.wav");
        StdAudioPlayer player = new SimpleAudioPlayerAdapter(url);
        player.einmaligAbspielen(url);
    }
}

