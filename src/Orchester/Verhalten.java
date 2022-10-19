package Orchester;

import Orchester.Orchester;

import java.io.IOException;

public interface Verhalten {
    /**
     *
     * @param orchester
     * @throws IOException
     *
     * Interface um zu entscheiden, ob eine Orchester.Orchester.Probe oder ein Orchester.Orchester.Konzert gespielt werden soll
     */
    void spielen(Orchester orchester) throws IOException;

}
