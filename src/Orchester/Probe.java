package Orchester;

import Audio.SimpleAudioPlayerAdapter;
import Audio.StdAudioPlayer;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

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
